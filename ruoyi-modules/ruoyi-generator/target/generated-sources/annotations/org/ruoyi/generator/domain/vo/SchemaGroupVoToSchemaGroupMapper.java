package org.ruoyi.generator.domain.vo;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.ruoyi.generator.domain.SchemaGroup;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {}
)
public interface SchemaGroupVoToSchemaGroupMapper extends BaseMapper<SchemaGroupVo, SchemaGroup> {
}
