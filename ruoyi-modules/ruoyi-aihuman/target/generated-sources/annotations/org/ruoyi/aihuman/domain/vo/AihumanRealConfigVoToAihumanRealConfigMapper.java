package org.ruoyi.aihuman.domain.vo;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.ruoyi.aihuman.domain.AihumanRealConfig;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {}
)
public interface AihumanRealConfigVoToAihumanRealConfigMapper extends BaseMapper<AihumanRealConfigVo, AihumanRealConfig> {
}
