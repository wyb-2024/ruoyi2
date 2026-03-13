package org.ruoyi.aihuman.domain;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.ruoyi.aihuman.domain.vo.AihumanRealConfigVo;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {}
)
public interface AihumanRealConfigToAihumanRealConfigVoMapper extends BaseMapper<AihumanRealConfig, AihumanRealConfigVo> {
}
