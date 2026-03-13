package org.ruoyi.domain;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.ruoyi.domain.vo.KnowledgeRoleVo;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {}
)
public interface KnowledgeRoleToKnowledgeRoleVoMapper extends BaseMapper<KnowledgeRole, KnowledgeRoleVo> {
}
