package org.ruoyi.domain;

import javax.annotation.processing.Generated;
import org.ruoyi.domain.vo.KnowledgeAttachVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:43:23+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class KnowledgeAttachToKnowledgeAttachVoMapperImpl implements KnowledgeAttachToKnowledgeAttachVoMapper {

    @Override
    public KnowledgeAttachVo convert(KnowledgeAttach arg0) {
        if ( arg0 == null ) {
            return null;
        }

        KnowledgeAttachVo knowledgeAttachVo = new KnowledgeAttachVo();

        knowledgeAttachVo.setId( arg0.getId() );
        knowledgeAttachVo.setKid( arg0.getKid() );
        knowledgeAttachVo.setDocId( arg0.getDocId() );
        knowledgeAttachVo.setDocName( arg0.getDocName() );
        knowledgeAttachVo.setDocType( arg0.getDocType() );
        knowledgeAttachVo.setContent( arg0.getContent() );
        knowledgeAttachVo.setRemark( arg0.getRemark() );
        knowledgeAttachVo.setOssId( arg0.getOssId() );
        knowledgeAttachVo.setPicStatus( arg0.getPicStatus() );
        knowledgeAttachVo.setPicAnysStatus( arg0.getPicAnysStatus() );
        knowledgeAttachVo.setVectorStatus( arg0.getVectorStatus() );

        return knowledgeAttachVo;
    }

    @Override
    public KnowledgeAttachVo convert(KnowledgeAttach arg0, KnowledgeAttachVo arg1) {
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
