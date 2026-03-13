package org.ruoyi.generator.domain.bo;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.ruoyi.generator.domain.SchemaField;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {}
)
public interface SchemaFieldBoToSchemaFieldMapper extends BaseMapper<SchemaFieldBo, SchemaField> {
}
