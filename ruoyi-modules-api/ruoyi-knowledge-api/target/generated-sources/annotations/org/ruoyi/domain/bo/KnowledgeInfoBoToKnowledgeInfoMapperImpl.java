package org.ruoyi.domain.bo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.ruoyi.domain.KnowledgeInfo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:43:23+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class KnowledgeInfoBoToKnowledgeInfoMapperImpl implements KnowledgeInfoBoToKnowledgeInfoMapper {

    @Override
    public KnowledgeInfo convert(KnowledgeInfoBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        KnowledgeInfo knowledgeInfo = new KnowledgeInfo();

        knowledgeInfo.setSearchValue( arg0.getSearchValue() );
        knowledgeInfo.setCreateDept( arg0.getCreateDept() );
        knowledgeInfo.setCreateBy( arg0.getCreateBy() );
        knowledgeInfo.setCreateTime( arg0.getCreateTime() );
        knowledgeInfo.setUpdateBy( arg0.getUpdateBy() );
        knowledgeInfo.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            knowledgeInfo.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        knowledgeInfo.setId( arg0.getId() );
        knowledgeInfo.setKid( arg0.getKid() );
        knowledgeInfo.setUid( arg0.getUid() );
        knowledgeInfo.setKname( arg0.getKname() );
        knowledgeInfo.setShare( arg0.getShare() );
        knowledgeInfo.setDescription( arg0.getDescription() );
        knowledgeInfo.setKnowledgeSeparator( arg0.getKnowledgeSeparator() );
        knowledgeInfo.setQuestionSeparator( arg0.getQuestionSeparator() );
        knowledgeInfo.setOverlapChar( arg0.getOverlapChar() );
        knowledgeInfo.setRetrieveLimit( arg0.getRetrieveLimit() );
        knowledgeInfo.setTextBlockSize( arg0.getTextBlockSize() );
        knowledgeInfo.setVectorModelName( arg0.getVectorModelName() );
        knowledgeInfo.setEmbeddingModelId( arg0.getEmbeddingModelId() );
        knowledgeInfo.setEmbeddingModelName( arg0.getEmbeddingModelName() );
        knowledgeInfo.setSystemPrompt( arg0.getSystemPrompt() );
        knowledgeInfo.setRemark( arg0.getRemark() );

        return knowledgeInfo;
    }

    @Override
    public KnowledgeInfo convert(KnowledgeInfoBo arg0, KnowledgeInfo arg1) {
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
        arg1.setUid( arg0.getUid() );
        arg1.setKname( arg0.getKname() );
        arg1.setShare( arg0.getShare() );
        arg1.setDescription( arg0.getDescription() );
        arg1.setKnowledgeSeparator( arg0.getKnowledgeSeparator() );
        arg1.setQuestionSeparator( arg0.getQuestionSeparator() );
        arg1.setOverlapChar( arg0.getOverlapChar() );
        arg1.setRetrieveLimit( arg0.getRetrieveLimit() );
        arg1.setTextBlockSize( arg0.getTextBlockSize() );
        arg1.setVectorModelName( arg0.getVectorModelName() );
        arg1.setEmbeddingModelId( arg0.getEmbeddingModelId() );
        arg1.setEmbeddingModelName( arg0.getEmbeddingModelName() );
        arg1.setSystemPrompt( arg0.getSystemPrompt() );
        arg1.setRemark( arg0.getRemark() );

        return arg1;
    }
}
