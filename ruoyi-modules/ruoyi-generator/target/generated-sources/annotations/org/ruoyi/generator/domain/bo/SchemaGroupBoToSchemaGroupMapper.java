package org.ruoyi.generator.domain.bo;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.ruoyi.generator.domain.SchemaGroup;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {}
)
public interface SchemaGroupBoToSchemaGroupMapper extends BaseMapper<SchemaGroupBo, SchemaGroup> {
}
