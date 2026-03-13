package io.github.linpeilie;

import org.ruoyi.domain.ChatMessage;
import org.ruoyi.domain.ChatMessageToChatMessageVoMapper;
import org.ruoyi.domain.ChatModel;
import org.ruoyi.domain.ChatModelToChatModelVoMapper;
import org.ruoyi.domain.ChatPayOrder;
import org.ruoyi.domain.ChatPayOrderToChatPayOrderVoMapper;
import org.ruoyi.domain.ChatSession;
import org.ruoyi.domain.ChatSessionToChatSessionVoMapper;
import org.ruoyi.domain.ChatUsageToken;
import org.ruoyi.domain.ChatUsageTokenToChatUsageTokenVoMapper;
import org.ruoyi.domain.McpInfo;
import org.ruoyi.domain.McpInfoToMcpInfoVoMapper;
import org.ruoyi.domain.PromptTemplate;
import org.ruoyi.domain.PromptTemplateToPromptTemplateVoMapper;
import org.ruoyi.domain.bo.ChatMessageBo;
import org.ruoyi.domain.bo.ChatMessageBoToChatMessageMapper;
import org.ruoyi.domain.bo.ChatModelBo;
import org.ruoyi.domain.bo.ChatModelBoToChatModelMapper;
import org.ruoyi.domain.bo.ChatPayOrderBo;
import org.ruoyi.domain.bo.ChatPayOrderBoToChatPayOrderMapper;
import org.ruoyi.domain.bo.ChatSessionBo;
import org.ruoyi.domain.bo.ChatSessionBoToChatSessionMapper;
import org.ruoyi.domain.bo.ChatUsageTokenBo;
import org.ruoyi.domain.bo.ChatUsageTokenBoToChatUsageTokenMapper;
import org.ruoyi.domain.bo.McpInfoBo;
import org.ruoyi.domain.bo.McpInfoBoToMcpInfoMapper;
import org.ruoyi.domain.bo.PromptTemplateBo;
import org.ruoyi.domain.bo.PromptTemplateBoToPromptTemplateMapper;
import org.ruoyi.domain.vo.ChatMessageVo;
import org.ruoyi.domain.vo.ChatMessageVoToChatMessageMapper;
import org.ruoyi.domain.vo.ChatModelVo;
import org.ruoyi.domain.vo.ChatModelVoToChatModelMapper;
import org.ruoyi.domain.vo.ChatPayOrderVo;
import org.ruoyi.domain.vo.ChatPayOrderVoToChatPayOrderMapper;
import org.ruoyi.domain.vo.ChatSessionVo;
import org.ruoyi.domain.vo.ChatSessionVoToChatSessionMapper;
import org.ruoyi.domain.vo.ChatUsageTokenVo;
import org.ruoyi.domain.vo.ChatUsageTokenVoToChatUsageTokenMapper;
import org.ruoyi.domain.vo.McpInfoVo;
import org.ruoyi.domain.vo.McpInfoVoToMcpInfoMapper;
import org.ruoyi.domain.vo.PromptTemplateVo;
import org.ruoyi.domain.vo.PromptTemplateVoToPromptTemplateMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class ConvertMapperAdapter {
  private ChatSessionVoToChatSessionMapper chatSessionVoToChatSessionMapper;

  private McpInfoBoToMcpInfoMapper mcpInfoBoToMcpInfoMapper;

  private ChatModelBoToChatModelMapper chatModelBoToChatModelMapper;

  private ChatUsageTokenBoToChatUsageTokenMapper chatUsageTokenBoToChatUsageTokenMapper;

  private ChatUsageTokenVoToChatUsageTokenMapper chatUsageTokenVoToChatUsageTokenMapper;

  private ChatMessageVoToChatMessageMapper chatMessageVoToChatMessageMapper;

  private ChatPayOrderVoToChatPayOrderMapper chatPayOrderVoToChatPayOrderMapper;

  private PromptTemplateBoToPromptTemplateMapper promptTemplateBoToPromptTemplateMapper;

  private ChatSessionToChatSessionVoMapper chatSessionToChatSessionVoMapper;

  private ChatUsageTokenToChatUsageTokenVoMapper chatUsageTokenToChatUsageTokenVoMapper;

  private McpInfoToMcpInfoVoMapper mcpInfoToMcpInfoVoMapper;

  private ChatModelToChatModelVoMapper chatModelToChatModelVoMapper;

  private McpInfoVoToMcpInfoMapper mcpInfoVoToMcpInfoMapper;

  private PromptTemplateToPromptTemplateVoMapper promptTemplateToPromptTemplateVoMapper;

  private ChatMessageBoToChatMessageMapper chatMessageBoToChatMessageMapper;

  private ChatModelVoToChatModelMapper chatModelVoToChatModelMapper;

  private ChatPayOrderBoToChatPayOrderMapper chatPayOrderBoToChatPayOrderMapper;

  private PromptTemplateVoToPromptTemplateMapper promptTemplateVoToPromptTemplateMapper;

  private ChatSessionBoToChatSessionMapper chatSessionBoToChatSessionMapper;

  private ChatPayOrderToChatPayOrderVoMapper chatPayOrderToChatPayOrderVoMapper;

  private ChatMessageToChatMessageVoMapper chatMessageToChatMessageVoMapper;

  @Autowired
  public void setChatSessionVoToChatSessionMapper(@Lazy ChatSessionVoToChatSessionMapper chatSessionVoToChatSessionMapper) {
    this.chatSessionVoToChatSessionMapper = chatSessionVoToChatSessionMapper;
  }

  @Autowired
  public void setMcpInfoBoToMcpInfoMapper(@Lazy McpInfoBoToMcpInfoMapper mcpInfoBoToMcpInfoMapper) {
    this.mcpInfoBoToMcpInfoMapper = mcpInfoBoToMcpInfoMapper;
  }

  @Autowired
  public void setChatModelBoToChatModelMapper(@Lazy ChatModelBoToChatModelMapper chatModelBoToChatModelMapper) {
    this.chatModelBoToChatModelMapper = chatModelBoToChatModelMapper;
  }

  @Autowired
  public void setChatUsageTokenBoToChatUsageTokenMapper(@Lazy ChatUsageTokenBoToChatUsageTokenMapper chatUsageTokenBoToChatUsageTokenMapper) {
    this.chatUsageTokenBoToChatUsageTokenMapper = chatUsageTokenBoToChatUsageTokenMapper;
  }

  @Autowired
  public void setChatUsageTokenVoToChatUsageTokenMapper(@Lazy ChatUsageTokenVoToChatUsageTokenMapper chatUsageTokenVoToChatUsageTokenMapper) {
    this.chatUsageTokenVoToChatUsageTokenMapper = chatUsageTokenVoToChatUsageTokenMapper;
  }

  @Autowired
  public void setChatMessageVoToChatMessageMapper(@Lazy ChatMessageVoToChatMessageMapper chatMessageVoToChatMessageMapper) {
    this.chatMessageVoToChatMessageMapper = chatMessageVoToChatMessageMapper;
  }

  @Autowired
  public void setChatPayOrderVoToChatPayOrderMapper(@Lazy ChatPayOrderVoToChatPayOrderMapper chatPayOrderVoToChatPayOrderMapper) {
    this.chatPayOrderVoToChatPayOrderMapper = chatPayOrderVoToChatPayOrderMapper;
  }

  @Autowired
  public void setPromptTemplateBoToPromptTemplateMapper(@Lazy PromptTemplateBoToPromptTemplateMapper promptTemplateBoToPromptTemplateMapper) {
    this.promptTemplateBoToPromptTemplateMapper = promptTemplateBoToPromptTemplateMapper;
  }

  @Autowired
  public void setChatSessionToChatSessionVoMapper(@Lazy ChatSessionToChatSessionVoMapper chatSessionToChatSessionVoMapper) {
    this.chatSessionToChatSessionVoMapper = chatSessionToChatSessionVoMapper;
  }

  @Autowired
  public void setChatUsageTokenToChatUsageTokenVoMapper(@Lazy ChatUsageTokenToChatUsageTokenVoMapper chatUsageTokenToChatUsageTokenVoMapper) {
    this.chatUsageTokenToChatUsageTokenVoMapper = chatUsageTokenToChatUsageTokenVoMapper;
  }

  @Autowired
  public void setMcpInfoToMcpInfoVoMapper(@Lazy McpInfoToMcpInfoVoMapper mcpInfoToMcpInfoVoMapper) {
    this.mcpInfoToMcpInfoVoMapper = mcpInfoToMcpInfoVoMapper;
  }

  @Autowired
  public void setChatModelToChatModelVoMapper(@Lazy ChatModelToChatModelVoMapper chatModelToChatModelVoMapper) {
    this.chatModelToChatModelVoMapper = chatModelToChatModelVoMapper;
  }

  @Autowired
  public void setMcpInfoVoToMcpInfoMapper(@Lazy McpInfoVoToMcpInfoMapper mcpInfoVoToMcpInfoMapper) {
    this.mcpInfoVoToMcpInfoMapper = mcpInfoVoToMcpInfoMapper;
  }

  @Autowired
  public void setPromptTemplateToPromptTemplateVoMapper(@Lazy PromptTemplateToPromptTemplateVoMapper promptTemplateToPromptTemplateVoMapper) {
    this.promptTemplateToPromptTemplateVoMapper = promptTemplateToPromptTemplateVoMapper;
  }

  @Autowired
  public void setChatMessageBoToChatMessageMapper(@Lazy ChatMessageBoToChatMessageMapper chatMessageBoToChatMessageMapper) {
    this.chatMessageBoToChatMessageMapper = chatMessageBoToChatMessageMapper;
  }

  @Autowired
  public void setChatModelVoToChatModelMapper(@Lazy ChatModelVoToChatModelMapper chatModelVoToChatModelMapper) {
    this.chatModelVoToChatModelMapper = chatModelVoToChatModelMapper;
  }

  @Autowired
  public void setChatPayOrderBoToChatPayOrderMapper(@Lazy ChatPayOrderBoToChatPayOrderMapper chatPayOrderBoToChatPayOrderMapper) {
    this.chatPayOrderBoToChatPayOrderMapper = chatPayOrderBoToChatPayOrderMapper;
  }

  @Autowired
  public void setPromptTemplateVoToPromptTemplateMapper(@Lazy PromptTemplateVoToPromptTemplateMapper promptTemplateVoToPromptTemplateMapper) {
    this.promptTemplateVoToPromptTemplateMapper = promptTemplateVoToPromptTemplateMapper;
  }

  @Autowired
  public void setChatSessionBoToChatSessionMapper(@Lazy ChatSessionBoToChatSessionMapper chatSessionBoToChatSessionMapper) {
    this.chatSessionBoToChatSessionMapper = chatSessionBoToChatSessionMapper;
  }

  @Autowired
  public void setChatPayOrderToChatPayOrderVoMapper(@Lazy ChatPayOrderToChatPayOrderVoMapper chatPayOrderToChatPayOrderVoMapper) {
    this.chatPayOrderToChatPayOrderVoMapper = chatPayOrderToChatPayOrderVoMapper;
  }

  @Autowired
  public void setChatMessageToChatMessageVoMapper(@Lazy ChatMessageToChatMessageVoMapper chatMessageToChatMessageVoMapper) {
    this.chatMessageToChatMessageVoMapper = chatMessageToChatMessageVoMapper;
  }

  public ChatSession chatSessionVoToChatSession(ChatSessionVo chatSessionVo) {
    return chatSessionVoToChatSessionMapper.convert(chatSessionVo);
  }

  public McpInfo mcpInfoBoToMcpInfo(McpInfoBo mcpInfoBo) {
    return mcpInfoBoToMcpInfoMapper.convert(mcpInfoBo);
  }

  public ChatModel chatModelBoToChatModel(ChatModelBo chatModelBo) {
    return chatModelBoToChatModelMapper.convert(chatModelBo);
  }

  public ChatUsageToken chatUsageTokenBoToChatUsageToken(ChatUsageTokenBo chatUsageTokenBo) {
    return chatUsageTokenBoToChatUsageTokenMapper.convert(chatUsageTokenBo);
  }

  public ChatUsageToken chatUsageTokenVoToChatUsageToken(ChatUsageTokenVo chatUsageTokenVo) {
    return chatUsageTokenVoToChatUsageTokenMapper.convert(chatUsageTokenVo);
  }

  public ChatMessage chatMessageVoToChatMessage(ChatMessageVo chatMessageVo) {
    return chatMessageVoToChatMessageMapper.convert(chatMessageVo);
  }

  public ChatPayOrder chatPayOrderVoToChatPayOrder(ChatPayOrderVo chatPayOrderVo) {
    return chatPayOrderVoToChatPayOrderMapper.convert(chatPayOrderVo);
  }

  public PromptTemplate promptTemplateBoToPromptTemplate(PromptTemplateBo promptTemplateBo) {
    return promptTemplateBoToPromptTemplateMapper.convert(promptTemplateBo);
  }

  public ChatSessionVo chatSessionToChatSessionVo(ChatSession chatSession) {
    return chatSessionToChatSessionVoMapper.convert(chatSession);
  }

  public ChatUsageTokenVo chatUsageTokenToChatUsageTokenVo(ChatUsageToken chatUsageToken) {
    return chatUsageTokenToChatUsageTokenVoMapper.convert(chatUsageToken);
  }

  public McpInfoVo mcpInfoToMcpInfoVo(McpInfo mcpInfo) {
    return mcpInfoToMcpInfoVoMapper.convert(mcpInfo);
  }

  public ChatModelVo chatModelToChatModelVo(ChatModel chatModel) {
    return chatModelToChatModelVoMapper.convert(chatModel);
  }

  public McpInfo mcpInfoVoToMcpInfo(McpInfoVo mcpInfoVo) {
    return mcpInfoVoToMcpInfoMapper.convert(mcpInfoVo);
  }

  public PromptTemplateVo promptTemplateToPromptTemplateVo(PromptTemplate promptTemplate) {
    return promptTemplateToPromptTemplateVoMapper.convert(promptTemplate);
  }

  public ChatMessage chatMessageBoToChatMessage(ChatMessageBo chatMessageBo) {
    return chatMessageBoToChatMessageMapper.convert(chatMessageBo);
  }

  public ChatModel chatModelVoToChatModel(ChatModelVo chatModelVo) {
    return chatModelVoToChatModelMapper.convert(chatModelVo);
  }

  public ChatPayOrder chatPayOrderBoToChatPayOrder(ChatPayOrderBo chatPayOrderBo) {
    return chatPayOrderBoToChatPayOrderMapper.convert(chatPayOrderBo);
  }

  public PromptTemplate promptTemplateVoToPromptTemplate(PromptTemplateVo promptTemplateVo) {
    return promptTemplateVoToPromptTemplateMapper.convert(promptTemplateVo);
  }

  public ChatSession chatSessionBoToChatSession(ChatSessionBo chatSessionBo) {
    return chatSessionBoToChatSessionMapper.convert(chatSessionBo);
  }

  public ChatPayOrderVo chatPayOrderToChatPayOrderVo(ChatPayOrder chatPayOrder) {
    return chatPayOrderToChatPayOrderVoMapper.convert(chatPayOrder);
  }

  public ChatMessageVo chatMessageToChatMessageVo(ChatMessage chatMessage) {
    return chatMessageToChatMessageVoMapper.convert(chatMessage);
  }
}
