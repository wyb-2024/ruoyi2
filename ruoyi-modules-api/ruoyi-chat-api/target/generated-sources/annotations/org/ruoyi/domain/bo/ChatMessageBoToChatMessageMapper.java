package org.ruoyi.domain.bo;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.ruoyi.domain.ChatMessage;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {}
)
public interface ChatMessageBoToChatMessageMapper extends BaseMapper<ChatMessageBo, ChatMessage> {
}
