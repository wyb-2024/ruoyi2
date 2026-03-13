package org.ruoyi.domain;

import javax.annotation.processing.Generated;
import org.ruoyi.domain.vo.KnowledgeInfoVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:43:23+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class KnowledgeInfoToKnowledgeInfoVoMapperImpl implements KnowledgeInfoToKnowledgeInfoVoMapper {

    @Override
    public KnowledgeInfoVo convert(KnowledgeInfo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        KnowledgeInfoVo knowledgeInfoVo = new KnowledgeInfoVo();

        knowledgeInfoVo.setId( arg0.getId() );
        knowledgeInfoVo.setKid( arg0.getKid() );
        knowledgeInfoVo.setUid( arg0.getUid() );
        knowledgeInfoVo.setKname( arg0.getKname() );
        knowledgeInfoVo.setShare( arg0.getShare() );
        knowledgeInfoVo.setDescription( arg0.getDescription() );
        knowledgeInfoVo.setKnowledgeSeparator( arg0.getKnowledgeSeparator() );
        knowledgeInfoVo.setQuestionSeparator( arg0.getQuestionSeparator() );
        if ( arg0.getOverlapChar() != null ) {
            knowledgeInfoVo.setOverlapChar( arg0.getOverlapChar().intValue() );
        }
        if ( arg0.getRetrieveLimit() != null ) {
            knowledgeInfoVo.setRetrieveLimit( arg0.getRetrieveLimit().intValue() );
        }
        if ( arg0.getTextBlockSize() != null ) {
            knowledgeInfoVo.setTextBlockSize( arg0.getTextBlockSize().intValue() );
        }
        knowledgeInfoVo.setVectorModelName( arg0.getVectorModelName() );
        knowledgeInfoVo.setEmbeddingModelId( arg0.getEmbeddingModelId() );
        knowledgeInfoVo.setEmbeddingModelName( arg0.getEmbeddingModelName() );
        knowledgeInfoVo.setSystemPrompt( arg0.getSystemPrompt() );
        knowledgeInfoVo.setRemark( arg0.getRemark() );

        return knowledgeInfoVo;
    }

    @Override
    public KnowledgeInfoVo convert(KnowledgeInfo arg0, KnowledgeInfoVo arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setKid( arg0.getKid() );
        arg1.setUid( arg0.getUid() );
        arg1.setKname( arg0.getKname() );
        arg1.setShare( arg0.getShare() );
        arg1.setDescription( arg0.getDescription() );
        arg1.setKnowledgeSeparator( arg0.getKnowledgeSeparator() );
        arg1.setQuestionSeparator( arg0.getQuestionSeparator() );
        if ( arg0.getOverlapChar() != null ) {
            arg1.setOverlapChar( arg0.getOverlapChar().intValue() );
        }
        else {
            arg1.setOverlapChar( null );
        }
        if ( arg0.getRetrieveLimit() != null ) {
            arg1.setRetrieveLimit( arg0.getRetrieveLimit().intValue() );
        }
        else {
            arg1.setRetrieveLimit( null );
        }
        if ( arg0.getTextBlockSize() != null ) {
            arg1.setTextBlockSize( arg0.getTextBlockSize().intValue() );
        }
        else {
            arg1.setTextBlockSize( null );
        }
        arg1.setVectorModelName( arg0.getVectorModelName() );
        arg1.setEmbeddingModelId( arg0.getEmbeddingModelId() );
        arg1.setEmbeddingModelName( arg0.getEmbeddingModelName() );
        arg1.setSystemPrompt( arg0.getSystemPrompt() );
        arg1.setRemark( arg0.getRemark() );

        return arg1;
    }
}
