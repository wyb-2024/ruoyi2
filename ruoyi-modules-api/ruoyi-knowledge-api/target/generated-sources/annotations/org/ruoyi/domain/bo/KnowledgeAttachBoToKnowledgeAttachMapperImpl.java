package org.ruoyi.domain.bo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.ruoyi.domain.KnowledgeAttach;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:43:23+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class KnowledgeAttachBoToKnowledgeAttachMapperImpl implements KnowledgeAttachBoToKnowledgeAttachMapper {

    @Override
    public KnowledgeAttach convert(KnowledgeAttachBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        KnowledgeAttach knowledgeAttach = new KnowledgeAttach();

        knowledgeAttach.setSearchValue( arg0.getSearchValue() );
        knowledgeAttach.setCreateDept( arg0.getCreateDept() );
        knowledgeAttach.setCreateBy( arg0.getCreateBy() );
        knowledgeAttach.setCreateTime( arg0.getCreateTime() );
        knowledgeAttach.setUpdateBy( arg0.getUpdateBy() );
        knowledgeAttach.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            knowledgeAttach.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        knowledgeAttach.setId( arg0.getId() );
        knowledgeAttach.setKid( arg0.getKid() );
        knowledgeAttach.setDocId( arg0.getDocId() );
        knowledgeAttach.setDocName( arg0.getDocName() );
        knowledgeAttach.setDocType( arg0.getDocType() );
        knowledgeAttach.setContent( arg0.getContent() );
        knowledgeAttach.setRemark( arg0.getRemark() );
        knowledgeAttach.setOssId( arg0.getOssId() );
        knowledgeAttach.setPicStatus( arg0.getPicStatus() );
        knowledgeAttach.setPicAnysStatus( arg0.getPicAnysStatus() );
        knowledgeAttach.setVectorStatus( arg0.getVectorStatus() );

        return knowledgeAttach;
    }

    @Override
    public KnowledgeAttach convert(KnowledgeAttachBo arg0, KnowledgeAttach arg1) {
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
        arg1.setDocName( arg0.getDocName() );
        arg1.setDocType( arg0.getDocType() );
        arg1.setContent( arg0.getContent() );
        arg1.setRemark( arg0.getRemark() );
        arg1.setOssId( arg0.getOssId() );
        arg1.setPicStatus( arg0.getPicStatus() );
        arg1.setPicAnysStatus( arg0.getPicAnysStatus() );
        arg1.setVectorStatus( arg0.getVectorStatus() );

        return arg1;
    }
}
