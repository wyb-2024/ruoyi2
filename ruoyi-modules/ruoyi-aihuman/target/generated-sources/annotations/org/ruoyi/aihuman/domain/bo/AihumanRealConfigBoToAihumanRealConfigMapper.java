package org.ruoyi.aihuman.domain.bo;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.ruoyi.aihuman.domain.AihumanRealConfig;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {}
)
public interface AihumanRealConfigBoToAihumanRealConfigMapper extends BaseMapper<AihumanRealConfigBo, AihumanRealConfig> {
}
