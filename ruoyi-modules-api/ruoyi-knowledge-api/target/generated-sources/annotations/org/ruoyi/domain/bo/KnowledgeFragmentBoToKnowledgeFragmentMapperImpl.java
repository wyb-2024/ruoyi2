package org.ruoyi.domain.bo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.ruoyi.domain.KnowledgeFragment;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:43:23+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class KnowledgeFragmentBoToKnowledgeFragmentMapperImpl implements KnowledgeFragmentBoToKnowledgeFragmentMapper {

    @Override
    public KnowledgeFragment convert(KnowledgeFragmentBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        KnowledgeFragment knowledgeFragment = new KnowledgeFragment();

        knowledgeFragment.setSearchValue( arg0.getSearchValue() );
        knowledgeFragment.setCreateDept( arg0.getCreateDept() );
        knowledgeFragment.setCreateBy( arg0.getCreateBy() );
        knowledgeFragment.setCreateTime( arg0.getCreateTime() );
        knowledgeFragment.setUpdateBy( arg0.getUpdateBy() );
        knowledgeFragment.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            knowledgeFragment.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        knowledgeFragment.setId( arg0.getId() );
        knowledgeFragment.setKid( arg0.getKid() );
        knowledgeFragment.setDocId( arg0.getDocId() );
        knowledgeFragment.setFid( arg0.getFid() );
        if ( arg0.getIdx() != null ) {
            knowledgeFragment.setIdx( arg0.getIdx().intValue() );
        }
        knowledgeFragment.setContent( arg0.getContent() );
        knowledgeFragment.setRemark( arg0.getRemark() );

        return knowledgeFragment;
    }

    @Override
    public KnowledgeFragment convert(KnowledgeFragmentBo arg0, KnowledgeFragment arg1) {
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
        arg1.setKid( arg0.getKid() );
        arg1.setDocId( arg0.getDocId() );
        arg1.setFid( arg0.getFid() );
        if ( arg0.getIdx() != null ) {
            arg1.setIdx( arg0.getIdx().intValue() );
        }
        else {
            arg1.setIdx( null );
        }
        arg1.setContent( arg0.getContent() );
        arg1.setRemark( arg0.getRemark() );

        return arg1;
    }
}
