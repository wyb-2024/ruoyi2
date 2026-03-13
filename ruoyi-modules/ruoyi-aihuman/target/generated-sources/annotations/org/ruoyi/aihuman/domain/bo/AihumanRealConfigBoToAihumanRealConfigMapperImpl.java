package org.ruoyi.aihuman.domain.bo;

import javax.annotation.processing.Generated;
import org.ruoyi.aihuman.domain.AihumanRealConfig;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:44:08+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class AihumanRealConfigBoToAihumanRealConfigMapperImpl implements AihumanRealConfigBoToAihumanRealConfigMapper {

    @Override
    public AihumanRealConfig convert(AihumanRealConfigBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AihumanRealConfig aihumanRealConfig = new AihumanRealConfig();

        aihumanRealConfig.setId( arg0.getId() );
        aihumanRealConfig.setName( arg0.getName() );
        aihumanRealConfig.setAvatars( arg0.getAvatars() );
        aihumanRealConfig.setModels( arg0.getModels() );
        aihumanRealConfig.setAvatarsParams( arg0.getAvatarsParams() );
        aihumanRealConfig.setModelsParams( arg0.getModelsParams() );
        aihumanRealConfig.setAgentParams( arg0.getAgentParams() );
        aihumanRealConfig.setCreateTime( arg0.getCreateTime() );
        aihumanRealConfig.setUpdateTime( arg0.getUpdateTime() );
        aihumanRealConfig.setStatus( arg0.getStatus() );
        aihumanRealConfig.setPublish( arg0.getPublish() );
        aihumanRealConfig.setRunParams( arg0.getRunParams() );
        aihumanRealConfig.setRunStatus( arg0.getRunStatus() );
        aihumanRealConfig.setCreateDept( arg0.getCreateDept() );
        aihumanRealConfig.setCreateBy( arg0.getCreateBy() );
        aihumanRealConfig.setUpdateBy( arg0.getUpdateBy() );

        return aihumanRealConfig;
    }

    @Override
    public AihumanRealConfig convert(AihumanRealConfigBo arg0, AihumanRealConfig arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setName( arg0.getName() );
        arg1.setAvatars( arg0.getAvatars() );
        arg1.setModels( arg0.getModels() );
        arg1.setAvatarsParams( arg0.getAvatarsParams() );
        arg1.setModelsParams( arg0.getModelsParams() );
        arg1.setAgentParams( arg0.getAgentParams() );
        arg1.setCreateTime( arg0.getCreateTime() );
        arg1.setUpdateTime( arg0.getUpdateTime() );
        arg1.setStatus( arg0.getStatus() );
        arg1.setPublish( arg0.getPublish() );
        arg1.setRunParams( arg0.getRunParams() );
        arg1.setRunStatus( arg0.getRunStatus() );
        arg1.setCreateDept( arg0.getCreateDept() );
        arg1.setCreateBy( arg0.getCreateBy() );
        arg1.setUpdateBy( arg0.getUpdateBy() );

        return arg1;
    }
}
