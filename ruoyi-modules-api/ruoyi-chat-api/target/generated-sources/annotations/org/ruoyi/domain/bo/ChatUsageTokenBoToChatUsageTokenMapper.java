package org.ruoyi.domain.bo;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.ruoyi.domain.ChatUsageToken;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {}
)
public interface ChatUsageTokenBoToChatUsageTokenMapper extends BaseMapper<ChatUsageTokenBo, ChatUsageToken> {
}
