package org.ruoyi.domain.bo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.ruoyi.domain.KnowledgeRoleRelation;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:43:23+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class KnowledgeRoleRelationBoToKnowledgeRoleRelationMapperImpl implements KnowledgeRoleRelationBoToKnowledgeRoleRelationMapper {

    @Override
    public KnowledgeRoleRelation convert(KnowledgeRoleRelationBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        KnowledgeRoleRelation knowledgeRoleRelation = new KnowledgeRoleRelation();

        knowledgeRoleRelation.setSearchValue( arg0.getSearchValue() );
        knowledgeRoleRelation.setCreateDept( arg0.getCreateDept() );
        knowledgeRoleRelation.setCreateBy( arg0.getCreateBy() );
        knowledgeRoleRelation.setCreateTime( arg0.getCreateTime() );
        knowledgeRoleRelation.setUpdateBy( arg0.getUpdateBy() );
        knowledgeRoleRelation.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            knowledgeRoleRelation.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        knowledgeRoleRelation.setId( arg0.getId() );
        knowledgeRoleRelation.setRemark( arg0.getRemark() );
        knowledgeRoleRelation.setKnowledgeRoleId( arg0.getKnowledgeRoleId() );
        knowledgeRoleRelation.setKnowledgeId( arg0.getKnowledgeId() );

        return knowledgeRoleRelation;
    }

    @Override
    public KnowledgeRoleRelation convert(KnowledgeRoleRelationBo arg0, KnowledgeRoleRelation arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setSearchValue( arg0.getSearchValue() );
        arg1.setCreateDept( arg0.getCreateDept() );
        arg1.setCreateBy( arg0.getCreateBy() );
        arg1.setCreateTime( arg0.getCreateTime() );
        arg1.setUpdateBy( arg0.getUpdateBy() );
        arg1.setUpdateTime( arg0.getUpdateTime() );
        if ( arg1.getParams() != null ) {
            Map<String, Object> map = arg0.getParams();
            if ( map != null ) {
                arg1.getParams().clear();
                arg1.getParams().putAll( map );
            }
            else {
                arg1.setParams( null );
            }
        }
        else {
            Map<String, Object> map = arg0.getParams();
            if ( map != null ) {
                arg1.setParams( new LinkedHashMap<String, Object>( map ) );
            }
        }
        arg1.setId( arg0.getId() );
        arg1.setRemark( arg0.getRemark() );
        arg1.setKnowledgeRoleId( arg0.getKnowledgeRoleId() );
        arg1.setKnowledgeId( arg0.getKnowledgeId() );

        return arg1;
    }
}
