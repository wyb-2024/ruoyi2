package org.ruoyi.generator.domain;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.ruoyi.generator.domain.vo.SchemaGroupVo;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {}
)
public interface SchemaGroupToSchemaGroupVoMapper extends BaseMapper<SchemaGroup, SchemaGroupVo> {
}
