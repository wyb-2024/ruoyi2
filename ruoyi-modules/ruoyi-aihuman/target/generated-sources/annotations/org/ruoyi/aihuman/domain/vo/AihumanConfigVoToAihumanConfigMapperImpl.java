package org.ruoyi.aihuman.domain.vo;

import javax.annotation.processing.Generated;
import org.ruoyi.aihuman.domain.AihumanConfig;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:44:08+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class AihumanConfigVoToAihumanConfigMapperImpl implements AihumanConfigVoToAihumanConfigMapper {

    @Override
    public AihumanConfig convert(AihumanConfigVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AihumanConfig aihumanConfig = new AihumanConfig();

        aihumanConfig.setId( arg0.getId() );
        aihumanConfig.setName( arg0.getName() );
        aihumanConfig.setModelName( arg0.getModelName() );
        aihumanConfig.setModelPath( arg0.getModelPath() );
        aihumanConfig.setModelParams( arg0.getModelParams() );
        aihumanConfig.setAgentParams( arg0.getAgentParams() );
        aihumanConfig.setCreateTime( arg0.getCreateTime() );
        aihumanConfig.setUpdateTime( arg0.getUpdateTime() );
        aihumanConfig.setStatus( arg0.getStatus() );
        aihumanConfig.setPublish( arg0.getPublish() );

        return aihumanConfig;
    }

    @Override
    public AihumanConfig convert(AihumanConfigVo arg0, AihumanConfig arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setName( arg0.getName() );
        arg1.setModelName( arg0.getModelName() );
        arg1.setModelPath( arg0.getModelPath() );
        arg1.setModelParams( arg0.getModelParams() );
        arg1.setAgentParams( arg0.getAgentParams() );
        arg1.setCreateTime( arg0.getCreateTime() );
        arg1.setUpdateTime( arg0.getUpdateTime() );
        arg1.setStatus( arg0.getStatus() );
        arg1.setPublish( arg0.getPublish() );

        return arg1;
    }
}
