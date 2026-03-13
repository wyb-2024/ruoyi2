package org.ruoyi.domain.vo;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.ruoyi.domain.PromptTemplate;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {}
)
public interface PromptTemplateVoToPromptTemplateMapper extends BaseMapper<PromptTemplateVo, PromptTemplate> {
}
