package org.ruoyi.aihuman.domain;

import javax.annotation.processing.Generated;
import org.ruoyi.aihuman.domain.vo.AihumanConfigVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:44:08+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class AihumanConfigToAihumanConfigVoMapperImpl implements AihumanConfigToAihumanConfigVoMapper {

    @Override
    public AihumanConfigVo convert(AihumanConfig arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AihumanConfigVo aihumanConfigVo = new AihumanConfigVo();

        aihumanConfigVo.setId( arg0.getId() );
        aihumanConfigVo.setName( arg0.getName() );
        aihumanConfigVo.setModelName( arg0.getModelName() );
        aihumanConfigVo.setModelPath( arg0.getModelPath() );
        aihumanConfigVo.setModelParams( arg0.getModelParams() );
        aihumanConfigVo.setAgentParams( arg0.getAgentParams() );
        aihumanConfigVo.setCreateTime( arg0.getCreateTime() );
        aihumanConfigVo.setUpdateTime( arg0.getUpdateTime() );
        aihumanConfigVo.setStatus( arg0.getStatus() );
        aihumanConfigVo.setPublish( arg0.getPublish() );

        return aihumanConfigVo;
    }

    @Override
    public AihumanConfigVo convert(AihumanConfig arg0, AihumanConfigVo arg1) {
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
