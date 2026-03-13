package org.ruoyi.generator.domain.bo;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.ruoyi.generator.domain.Schema;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {}
)
public interface SchemaBoToSchemaMapper extends BaseMapper<SchemaBo, Schema> {
}
