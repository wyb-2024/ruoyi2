package org.ruoyi.domain;

import javax.annotation.processing.Generated;
import org.ruoyi.domain.vo.KnowledgeRoleRelationVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:43:23+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class KnowledgeRoleRelationToKnowledgeRoleRelationVoMapperImpl implements KnowledgeRoleRelationToKnowledgeRoleRelationVoMapper {

    @Override
    public KnowledgeRoleRelationVo convert(KnowledgeRoleRelation arg0) {
        if ( arg0 == null ) {
            return null;
        }

        KnowledgeRoleRelationVo knowledgeRoleRelationVo = new KnowledgeRoleRelationVo();

        knowledgeRoleRelationVo.setId( arg0.getId() );
        knowledgeRoleRelationVo.setRemark( arg0.getRemark() );
        knowledgeRoleRelationVo.setKnowledgeRoleId( arg0.getKnowledgeRoleId() );
        knowledgeRoleRelationVo.setKnowledgeId( arg0.getKnowledgeId() );

        return knowledgeRoleRelationVo;
    }

    @Override
    public KnowledgeRoleRelationVo convert(KnowledgeRoleRelation arg0, KnowledgeRoleRelationVo arg1) {
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
