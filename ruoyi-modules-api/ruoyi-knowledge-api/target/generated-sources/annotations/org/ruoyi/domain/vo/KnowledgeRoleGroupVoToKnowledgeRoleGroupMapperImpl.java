package org.ruoyi.domain.vo;

import javax.annotation.processing.Generated;
import org.ruoyi.domain.KnowledgeRoleGroup;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:43:23+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class KnowledgeRoleGroupVoToKnowledgeRoleGroupMapperImpl implements KnowledgeRoleGroupVoToKnowledgeRoleGroupMapper {

    @Override
    public KnowledgeRoleGroup convert(KnowledgeRoleGroupVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        KnowledgeRoleGroup knowledgeRoleGroup = new KnowledgeRoleGroup();

        knowledgeRoleGroup.setCreateBy( arg0.getCreateBy() );
        knowledgeRoleGroup.setCreateTime( arg0.getCreateTime() );
        knowledgeRoleGroup.setUpdateBy( arg0.getUpdateBy() );
        knowledgeRoleGroup.setUpdateTime( arg0.getUpdateTime() );
        knowledgeRoleGroup.setId( arg0.getId() );
        knowledgeRoleGroup.setName( arg0.getName() );
        knowledgeRoleGroup.setRemark( arg0.getRemark() );

        return knowledgeRoleGroup;
    }

    @Override
    public KnowledgeRoleGroup convert(KnowledgeRoleGroupVo arg0, KnowledgeRoleGroup arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setCreateBy( arg0.getCreateBy() );
        arg1.setCreateTime( arg0.getCreateTime() );
        arg1.setUpdateBy( arg0.getUpdateBy() );
        arg1.setUpdateTime( arg0.getUpdateTime() );
        arg1.setId( arg0.getId() );
        arg1.setName( arg0.getName() );
        arg1.setRemark( arg0.getRemark() );

        return arg1;
    }
}
