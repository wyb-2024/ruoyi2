package org.ruoyi.domain.bo;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.ruoyi.domain.ChatSession;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {}
)
public interface ChatSessionBoToChatSessionMapper extends BaseMapper<ChatSessionBo, ChatSession> {
}
