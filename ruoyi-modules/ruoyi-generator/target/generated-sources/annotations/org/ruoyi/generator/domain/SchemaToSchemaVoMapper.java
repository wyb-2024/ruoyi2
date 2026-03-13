package org.ruoyi.generator.domain;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.ruoyi.generator.domain.vo.SchemaVo;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {}
)
public interface SchemaToSchemaVoMapper extends BaseMapper<Schema, SchemaVo> {
}
