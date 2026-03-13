package org.ruoyi.domain.vo;

import javax.annotation.processing.Generated;
import org.ruoyi.domain.KnowledgeRoleRelation;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:43:23+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class KnowledgeRoleRelationVoToKnowledgeRoleRelationMapperImpl implements KnowledgeRoleRelationVoToKnowledgeRoleRelationMapper {

    @Override
    public KnowledgeRoleRelation convert(KnowledgeRoleRelationVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        KnowledgeRoleRelation knowledgeRoleRelation = new KnowledgeRoleRelation();

        knowledgeRoleRelation.setId( arg0.getId() );
        knowledgeRoleRelation.setRemark( arg0.getRemark() );
        knowledgeRoleRelation.setKnowledgeRoleId( arg0.getKnowledgeRoleId() );
        knowledgeRoleRelation.setKnowledgeId( arg0.getKnowledgeId() );

        return knowledgeRoleRelation;
    }

    @Override
    public KnowledgeRoleRelation convert(KnowledgeRoleRelationVo arg0, KnowledgeRoleRelation arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setRemark( arg0.getRemark() );
        arg1.setKnowledgeRoleId( arg0.getKnowledgeRoleId() );
        arg1.setKnowledgeId( arg0.getKnowledgeId() );

        return arg1;
    }
}
