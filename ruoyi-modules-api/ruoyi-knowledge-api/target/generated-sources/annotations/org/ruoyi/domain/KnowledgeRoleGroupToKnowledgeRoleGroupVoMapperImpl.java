package org.ruoyi.domain;

import javax.annotation.processing.Generated;
import org.ruoyi.domain.vo.KnowledgeRoleGroupVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:43:23+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class KnowledgeRoleGroupToKnowledgeRoleGroupVoMapperImpl implements KnowledgeRoleGroupToKnowledgeRoleGroupVoMapper {

    @Override
    public KnowledgeRoleGroupVo convert(KnowledgeRoleGroup arg0) {
        if ( arg0 == null ) {
            return null;
        }

        KnowledgeRoleGroupVo knowledgeRoleGroupVo = new KnowledgeRoleGroupVo();

        knowledgeRoleGroupVo.setId( arg0.getId() );
        knowledgeRoleGroupVo.setName( arg0.getName() );
        knowledgeRoleGroupVo.setCreateBy( arg0.getCreateBy() );
        knowledgeRoleGroupVo.setCreateTime( arg0.getCreateTime() );
        knowledgeRoleGroupVo.setUpdateBy( arg0.getUpdateBy() );
        knowledgeRoleGroupVo.setUpdateTime( arg0.getUpdateTime() );
        knowledgeRoleGroupVo.setRemark( arg0.getRemark() );

        return knowledgeRoleGroupVo;
    }

    @Override
    public KnowledgeRoleGroupVo convert(KnowledgeRoleGroup arg0, KnowledgeRoleGroupVo arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setName( arg0.getName() );
        arg1.setCreateBy( arg0.getCreateBy() );
        arg1.setCreateTime( arg0.getCreateTime() );
        arg1.setUpdateBy( arg0.getUpdateBy() );
        arg1.setUpdateTime( arg0.getUpdateTime() );
        arg1.setRemark( arg0.getRemark() );

        return arg1;
    }
}
