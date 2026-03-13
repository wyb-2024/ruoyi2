package org.ruoyi.system.domain.bo;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.ruoyi.system.domain.ChatConfig;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {}
)
public interface ChatConfigBoToChatConfigMapper extends BaseMapper<ChatConfigBo, ChatConfig> {
}
