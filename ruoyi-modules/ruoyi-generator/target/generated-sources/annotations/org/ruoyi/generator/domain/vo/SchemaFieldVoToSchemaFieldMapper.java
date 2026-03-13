package org.ruoyi.generator.domain.vo;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.ruoyi.generator.domain.SchemaField;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {}
)
public interface SchemaFieldVoToSchemaFieldMapper extends BaseMapper<SchemaFieldVo, SchemaField> {
}
