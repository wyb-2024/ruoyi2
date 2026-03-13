package org.ruoyi.domain;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.ruoyi.domain.vo.KnowledgeRoleGroupVo;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {}
)
public interface KnowledgeRoleGroupToKnowledgeRoleGroupVoMapper extends BaseMapper<KnowledgeRoleGroup, KnowledgeRoleGroupVo> {
}
