package org.ruoyi.domain.vo;

import javax.annotation.processing.Generated;
import org.ruoyi.domain.KnowledgeInfo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:43:23+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class KnowledgeInfoVoToKnowledgeInfoMapperImpl implements KnowledgeInfoVoToKnowledgeInfoMapper {

    @Override
    public KnowledgeInfo convert(KnowledgeInfoVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        KnowledgeInfo knowledgeInfo = new KnowledgeInfo();

        knowledgeInfo.setId( arg0.getId() );
        knowledgeInfo.setKid( arg0.getKid() );
        knowledgeInfo.setUid( arg0.getUid() );
        knowledgeInfo.setKname( arg0.getKname() );
        knowledgeInfo.setShare( arg0.getShare() );
        knowledgeInfo.setDescription( arg0.getDescription() );
        knowledgeInfo.setKnowledgeSeparator( arg0.getKnowledgeSeparator() );
        knowledgeInfo.setQuestionSeparator( arg0.getQuestionSeparator() );
        if ( arg0.getOverlapChar() != null ) {
            knowledgeInfo.setOverlapChar( arg0.getOverlapChar().longValue() );
        }
        if ( arg0.getRetrieveLimit() != null ) {
            knowledgeInfo.setRetrieveLimit( arg0.getRetrieveLimit().longValue() );
        }
        if ( arg0.getTextBlockSize() != null ) {
            knowledgeInfo.setTextBlockSize( arg0.getTextBlockSize().longValue() );
        }
        knowledgeInfo.setVectorModelName( arg0.getVectorModelName() );
        knowledgeInfo.setEmbeddingModelId( arg0.getEmbeddingModelId() );
        knowledgeInfo.setEmbeddingModelName( arg0.getEmbeddingModelName() );
        knowledgeInfo.setSystemPrompt( arg0.getSystemPrompt() );
        knowledgeInfo.setRemark( arg0.getRemark() );

        return knowledgeInfo;
    }

    @Override
    public KnowledgeInfo convert(KnowledgeInfoVo arg0, KnowledgeInfo arg1) {
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
            arg1.setOverlapChar( arg0.getOverlapChar().longValue() );
        }
        else {
            arg1.setOverlapChar( null );
        }
        if ( arg0.getRetrieveLimit() != null ) {
            arg1.setRetrieveLimit( arg0.getRetrieveLimit().longValue() );
        }
        else {
            arg1.setRetrieveLimit( null );
        }
        if ( arg0.getTextBlockSize() != null ) {
            arg1.setTextBlockSize( arg0.getTextBlockSize().longValue() );
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
