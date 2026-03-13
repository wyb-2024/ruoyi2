package org.ruoyi.domain;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.ruoyi.domain.vo.PromptTemplateVo;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {}
)
public interface PromptTemplateToPromptTemplateVoMapper extends BaseMapper<PromptTemplate, PromptTemplateVo> {
}
