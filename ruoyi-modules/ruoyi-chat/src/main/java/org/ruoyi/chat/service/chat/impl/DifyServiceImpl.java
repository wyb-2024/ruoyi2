package org.ruoyi.chat.service.chat.impl;

import cn.hutool.core.util.StrUtil;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.extern.slf4j.Slf4j;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.ruoyi.chat.enums.ChatModeType;
import org.ruoyi.chat.service.chat.IChatCostService;
import org.ruoyi.chat.service.chat.IChatService;
import org.ruoyi.chat.support.RetryNotifier;
import org.ruoyi.common.chat.request.ChatRequest;
import org.ruoyi.domain.bo.ChatSessionBo;
import org.ruoyi.domain.vo.ChatModelVo;
import org.ruoyi.domain.vo.ChatSessionVo;
import org.ruoyi.service.IChatModelService;
import org.ruoyi.service.IChatSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * Dify 聊天管理
 *
 * <p>旧版 Dify SDK 会请求 /api/chat/send，与当前 Docker 部署的 Dify 版本不兼容。
 * 这里直接调用官方 /v1/chat-messages 接口并手动解析 SSE 响应。</p>
 *
 * @author ageer
 */
@Service
@Slf4j
public class DifyServiceImpl implements IChatService {

    private static final MediaType JSON = MediaType.get("application/json; charset=utf-8");
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    @Autowired
    private IChatModelService chatModelService;
    @Autowired
    private IChatSessionService chatSessionService;
    @Autowired
    private IChatCostService chatCostService;

    @Override
    public SseEmitter chat(ChatRequest chatRequest, SseEmitter emitter) {
        ChatModelVo chatModelVo = chatModelService.selectModelByName(chatRequest.getModel());
        ChatSessionVo sessionInfo = chatSessionService.queryById(chatRequest.getSessionId());

        String apiUrl = buildChatMessagesUrl(chatModelVo.getApiHost());
        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(60, TimeUnit.SECONDS)
                .readTimeout(600, TimeUnit.SECONDS)
                .build();

        ObjectNode requestBody = OBJECT_MAPPER.createObjectNode();
        requestBody.set("inputs", OBJECT_MAPPER.createObjectNode());
        requestBody.put("query", StrUtil.nullToDefault(chatRequest.getPrompt(), ""));
        requestBody.put("response_mode", "streaming");
        requestBody.put("user", String.valueOf(chatRequest.getUserId()));
        if (Objects.nonNull(sessionInfo) && isValidUuid(sessionInfo.getConversationId())) {
            requestBody.put("conversation_id", sessionInfo.getConversationId());
        } else if (Objects.nonNull(sessionInfo) && StrUtil.isNotBlank(sessionInfo.getConversationId())) {
            log.warn("Ignore invalid Dify conversation_id. sessionId={}, conversationId={}",
                    sessionInfo.getId(), sessionInfo.getConversationId());
        }

        try {
            String body = requestBody.toString();
            Request request = new Request.Builder()
                    .url(apiUrl)
                    .header("Authorization", "Bearer " + chatModelVo.getApiKey())
                    .header("Content-Type", "application/json")
                    .post(RequestBody.create(body, JSON))
                    .build();

            log.info("Dify request: model={}, url={}, sessionId={}, payload={}",
                    chatModelVo.getModelName(), apiUrl, chatRequest.getSessionId(), body);

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    log.error("Dify request failed: url={}, message={}", apiUrl, e.getMessage(), e);
                    handleStreamError(emitter, "Dify connection failed: " + e.getMessage());
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    try (response; ResponseBody responseBody = response.body()) {
                        if (!response.isSuccessful()) {
                            String errorBody = responseBody != null ? responseBody.string() : "";
                            log.error("Dify response failed: code={}, url={}, body={}",
                                    response.code(), apiUrl, errorBody);
                            handleStreamError(emitter, buildHttpError(response.code(), errorBody));
                            return;
                        }

                        if (responseBody == null) {
                            handleStreamError(emitter, "Dify response body is empty");
                            return;
                        }

                        handleStreamResponse(responseBody, emitter, sessionInfo);
                    } catch (Exception e) {
                        log.error("Dify stream parse failed: url={}, message={}", apiUrl, e.getMessage(), e);
                        handleStreamError(emitter, "Dify stream parse failed: " + e.getMessage());
                    }
                }
            });
        } catch (Exception e) {
            log.error("Dify request build failed: model={}, message={}",
                    chatRequest.getModel(), e.getMessage(), e);
            handleStreamError(emitter, e.getMessage());
        }

        return emitter;
    }

    private void handleStreamResponse(ResponseBody responseBody, SseEmitter emitter, ChatSessionVo sessionInfo)
            throws IOException {
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(responseBody.byteStream(), StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.isBlank() || !line.startsWith("data:")) {
                    continue;
                }

                String data = line.substring(5).trim();
                if (StrUtil.isBlank(data)) {
                    continue;
                }

                JsonNode root = OBJECT_MAPPER.readTree(data);
                String event = root.path("event").asText();

                if ("message".equals(event) || "agent_message".equals(event)) {
                    String answer = root.path("answer").asText("");
                    if (StrUtil.isNotBlank(answer)) {
                        emitter.send(answer);
                    }
                    continue;
                }

                if ("message_end".equals(event)) {
                    updateConversationIdIfNecessary(root.path("conversation_id").asText(""), sessionInfo);
                    emitter.complete();
                    RetryNotifier.clear(emitter);
                    return;
                }

                if ("error".equals(event)) {
                    String message = root.path("message").asText("Dify returned an error");
                    handleStreamError(emitter, message);
                    return;
                }
            }
        }

        emitter.complete();
        RetryNotifier.clear(emitter);
    }

    private void updateConversationIdIfNecessary(String conversationId, ChatSessionVo sessionInfo) {
        if (sessionInfo == null || !isValidUuid(conversationId)) {
            return;
        }

        ChatSessionBo chatSessionBo = new ChatSessionBo();
        chatSessionBo.setConversationId(conversationId);
        chatSessionBo.setId(sessionInfo.getId());
        chatSessionBo.setUserId(sessionInfo.getUserId());
        chatSessionBo.setSessionTitle(sessionInfo.getSessionTitle());
        chatSessionBo.setSessionContent(sessionInfo.getSessionContent());
        chatSessionBo.setRemark(sessionInfo.getRemark());
        chatSessionService.updateByBo(chatSessionBo);
        sessionInfo.setConversationId(conversationId);
    }

    private boolean isValidUuid(String value) {
        if (StrUtil.isBlank(value)) {
            return false;
        }
        try {
            UUID.fromString(value);
            return true;
        } catch (Exception ignored) {
            return false;
        }
    }

    private void handleStreamError(SseEmitter emitter, String message) {
        try {
            emitter.send(message);
        } catch (Exception ignored) {
            // ignore send failure and finish with error
        } finally {
            emitter.completeWithError(new RuntimeException(message));
            RetryNotifier.clear(emitter);
        }
    }

    private String buildChatMessagesUrl(String apiHost) {
        String baseUrl = StrUtil.removeSuffix(apiHost, "/");
        if (baseUrl.endsWith("/v1")) {
            return baseUrl + "/chat-messages";
        }
        return baseUrl + "/v1/chat-messages";
    }

    private String buildHttpError(int statusCode, String errorBody) {
        if (StrUtil.isBlank(errorBody)) {
            return "Dify API error: HTTP " + statusCode;
        }

        try {
            JsonNode root = OBJECT_MAPPER.readTree(errorBody);
            String message = root.path("message").asText();
            String code = root.path("code").asText();
            if (StrUtil.isNotBlank(message) || StrUtil.isNotBlank(code)) {
                return "Dify API error: " + code + " (" + statusCode + ") - " + message;
            }
        } catch (Exception ignored) {
            // fall through to raw body
        }

        return "Dify API error: HTTP " + statusCode + " - " + errorBody;
    }

    @Override
    public String getCategory() {
        return ChatModeType.DIFY.getCode();
    }

}
