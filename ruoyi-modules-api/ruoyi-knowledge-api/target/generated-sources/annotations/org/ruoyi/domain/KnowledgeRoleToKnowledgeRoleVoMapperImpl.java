package org.ruoyi.domain;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ruoyi.domain.vo.KnowledgeRoleVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:43:23+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class KnowledgeRoleToKnowledgeRoleVoMapperImpl implements KnowledgeRoleToKnowledgeRoleVoMapper {

    @Override
    public KnowledgeRoleVo convert(KnowledgeRole arg0) {
        if ( arg0 == null ) {
            return null;
        }

        KnowledgeRoleVo knowledgeRoleVo = new KnowledgeRoleVo();

        knowledgeRoleVo.setId( arg0.getId() );
        knowledgeRoleVo.setGroupId( arg0.getGroupId() );
        knowledgeRoleVo.setName( arg0.getName() );
        knowledgeRoleVo.setCreateBy( arg0.getCreateBy() );
        knowledgeRoleVo.setCreateTime( arg0.getCreateTime() );
        knowledgeRoleVo.setUpdateBy( arg0.getUpdateBy() );
        knowledgeRoleVo.setUpdateTime( arg0.getUpdateTime() );
        knowledgeRoleVo.setRemark( arg0.getRemark() );
        List<Long> list = arg0.getKnowledgeIds();
        if ( list != null ) {
            knowledgeRoleVo.setKnowledgeIds( new ArrayList<Long>( list ) );
        }

        return knowledgeRoleVo;
    }

    @Override
    public KnowledgeRoleVo convert(KnowledgeRole arg0, KnowledgeRoleVo arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setGroupId( arg0.getGroupId() );
        arg1.setName( arg0.getName() );
        arg1.setCreateBy( arg0.getCreateBy() );
        arg1.setCreateTime( arg0.getCreateTime() );
        arg1.setUpdateBy( arg0.getUpdateBy() );
        arg1.setUpdateTime( arg0.getUpdateTime() );
        arg1.setRemark( arg0.getRemark() );
        if ( arg1.getKnowledgeIds() != null ) {
            List<Long> list = arg0.getKnowledgeIds();
            if ( list != null ) {
                arg1.getKnowledgeIds().clear();
                arg1.getKnowledgeIds().addAll( list );
            }
            else {
                arg1.setKnowledgeIds( null );
            }
        }
        else {
            List<Long> list = arg0.getKnowledgeIds();
            if ( list != null ) {
                arg1.setKnowledgeIds( new ArrayList<Long>( list ) );
            }
        }

        return arg1;
    }
}
