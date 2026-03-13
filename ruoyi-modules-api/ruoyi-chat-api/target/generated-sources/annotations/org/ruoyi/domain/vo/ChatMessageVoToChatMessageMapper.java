package org.ruoyi.domain.vo;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.ruoyi.domain.ChatMessage;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {}
)
public interface ChatMessageVoToChatMessageMapper extends BaseMapper<ChatMessageVo, ChatMessage> {
}
