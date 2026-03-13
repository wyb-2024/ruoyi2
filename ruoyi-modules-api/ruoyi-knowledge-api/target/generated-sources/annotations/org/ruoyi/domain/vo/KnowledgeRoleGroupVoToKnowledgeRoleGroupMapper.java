package org.ruoyi.domain.vo;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.ruoyi.domain.KnowledgeRoleGroup;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {}
)
public interface KnowledgeRoleGroupVoToKnowledgeRoleGroupMapper extends BaseMapper<KnowledgeRoleGroupVo, KnowledgeRoleGroup> {
}
