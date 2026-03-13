package org.ruoyi.chat.service.chat.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import okhttp3.*;
import org.ruoyi.chat.enums.ChatModeType;
import org.ruoyi.chat.service.chat.IChatService;
import org.ruoyi.chat.support.ChatServiceHelper;
import org.ruoyi.common.chat.entity.chat.Message;
import org.ruoyi.common.chat.request.ChatRequest;
import org.ruoyi.domain.vo.ChatModelVo;
import org.ruoyi.service.IChatModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * 智谱AI - 使用OkHttp直接调用API以避免编码问题
 */
@Service
@Slf4j
public class ZhipuAiChatServiceImpl implements IChatService {

    private static final MediaType JSON = MediaType.get("application/json; charset=utf-8");
    private static final String ZHIPU_API_BASE = "https://open.bigmodel.cn/api/paas/v4";

    private final OkHttpClient client = new OkHttpClient.Builder()
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(60, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .build();

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    private IChatModelService chatModelService;

    @Override
    public SseEmitter chat(ChatRequest chatRequest, SseEmitter emitter) {
        ChatModelVo chatModelVo = chatModelService.selectModelByName(chatRequest.getModel());
        log.info("智谱AI模型: {}, API Key前10位: {}", chatModelVo.getModelName(),
                chatModelVo.getApiKey() != null ? chatModelVo.getApiKey().substring(0, Math.min(10, chatModelVo.getApiKey().length())) : "null");

        try {
            // 使用异步请求
            client.newCall(buildRequest(chatRequest, chatModelVo)).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                log.error("智谱AI请求失败: {}", e.getMessage(), e);
                ChatServiceHelper.onStreamError(emitter, e.getMessage());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (!response.isSuccessful()) {
                    String errorBody = response.body() != null ? response.body().string() : "未知错误";
                    log.error("智谱AI响应错误: {}, 状态码: {}", errorBody, response.code());
                    ChatServiceHelper.onStreamError(emitter, "API错误: " + errorBody);
                    return;
                }

                // 使用charStream()确保正确的字符编码
                try (BufferedReader reader = new BufferedReader(response.body().charStream())) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        log.debug("智谱AI原始响应行: {}", line);

                        // SSE格式: data: {...}
                        if (!line.startsWith("data: ")) {
                            continue;
                        }

                        String jsonData = line.substring(6).trim();

                        if ("[DONE]".equals(jsonData)) {
                            log.info("智谱AI响应完成");
                            emitter.complete();
                            return;
                        }

                        try {
                            JsonNode rootNode = objectMapper.readTree(jsonData);
                            JsonNode choices = rootNode.get("choices");

                            if (choices != null && choices.isArray() && choices.size() > 0) {
                                JsonNode delta = choices.get(0).get("delta");
                                if (delta != null) {
                                    JsonNode contentNode = delta.get("content");
                                    if (contentNode != null && !contentNode.isNull()) {
                                        String content = contentNode.asText();
                                        log.debug("智谱AI返回内容: [{}]", content);
                                        emitter.send(content);
                                    }
                                }
                            }
                        } catch (Exception e) {
                            log.error("解析智谱AI响应时出错: {}, 原始数据: {}", e.getMessage(), jsonData);
                        }
                    }
                } catch (Exception e) {
                    log.error("读取智谱AI响应流时出错: {}", e.getMessage(), e);
                    ChatServiceHelper.onStreamError(emitter, e.getMessage());
                }
            }
            });
        } catch (IOException e) {
            log.error("构建智谱AI请求失败: {}", e.getMessage(), e);
            ChatServiceHelper.onStreamError(emitter, e.getMessage());
        }

        return emitter;
    }

    private Request buildRequest(ChatRequest chatRequest, ChatModelVo chatModelVo) throws IOException {
        // 构建请求体
        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("model", chatModelVo.getModelName());
        requestBody.put("stream", true);

        // 构建消息列表
        List<Map<String, String>> messages = new ArrayList<>();

        // 添加历史对话消息
        if (chatRequest.getMessages() != null) {
            for (Message message : chatRequest.getMessages()) {
                if (message.getContent() == null || String.valueOf(message.getContent()).trim().isEmpty()) {
                    continue;
                }
                Map<String, String> msg = new HashMap<>();
                msg.put("role", message.getRole());
                msg.put("content", String.valueOf(message.getContent()));
                messages.add(msg);
            }
        }

        // 添加当前用户消息
        Map<String, String> userMsg = new HashMap<>();
        userMsg.put("role", "user");
        userMsg.put("content", chatRequest.getPrompt());
        messages.add(userMsg);

        requestBody.put("messages", messages);

        String jsonBody = objectMapper.writeValueAsString(requestBody);
        log.debug("智谱AI请求体: {}", jsonBody);

        return new Request.Builder()
                .url(ZHIPU_API_BASE + "/chat/completions")
                .header("Authorization", "Bearer " + chatModelVo.getApiKey())
                .header("Content-Type", "application/json; charset=utf-8")
                .header("Accept", "text/event-stream")
                .post(RequestBody.create(jsonBody, JSON))
                .build();
    }

    @Override
    public String getCategory() {
        return ChatModeType.ZHIPU.getCode();
    }
}
