package org.ruoyi.domain.vo;

import javax.annotation.processing.Generated;
import org.ruoyi.domain.KnowledgeAttach;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:43:23+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class KnowledgeAttachVoToKnowledgeAttachMapperImpl implements KnowledgeAttachVoToKnowledgeAttachMapper {

    @Override
    public KnowledgeAttach convert(KnowledgeAttachVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        KnowledgeAttach knowledgeAttach = new KnowledgeAttach();

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
    public KnowledgeAttach convert(KnowledgeAttachVo arg0, KnowledgeAttach arg1) {
        if ( arg0 == null ) {
            return arg1;
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
