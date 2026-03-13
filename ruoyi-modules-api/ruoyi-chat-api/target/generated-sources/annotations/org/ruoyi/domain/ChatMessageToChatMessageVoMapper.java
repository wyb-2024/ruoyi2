package org.ruoyi.domain;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.ruoyi.domain.vo.ChatMessageVo;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {}
)
public interface ChatMessageToChatMessageVoMapper extends BaseMapper<ChatMessage, ChatMessageVo> {
}
