package org.ruoyi.aihuman.domain;

import javax.annotation.processing.Generated;
import org.ruoyi.aihuman.domain.vo.AihumanRealConfigVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:44:08+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class AihumanRealConfigToAihumanRealConfigVoMapperImpl implements AihumanRealConfigToAihumanRealConfigVoMapper {

    @Override
    public AihumanRealConfigVo convert(AihumanRealConfig arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AihumanRealConfigVo aihumanRealConfigVo = new AihumanRealConfigVo();

        aihumanRealConfigVo.setId( arg0.getId() );
        aihumanRealConfigVo.setName( arg0.getName() );
        aihumanRealConfigVo.setAvatars( arg0.getAvatars() );
        aihumanRealConfigVo.setModels( arg0.getModels() );
        aihumanRealConfigVo.setAvatarsParams( arg0.getAvatarsParams() );
        aihumanRealConfigVo.setModelsParams( arg0.getModelsParams() );
        aihumanRealConfigVo.setAgentParams( arg0.getAgentParams() );
        aihumanRealConfigVo.setCreateTime( arg0.getCreateTime() );
        aihumanRealConfigVo.setUpdateTime( arg0.getUpdateTime() );
        aihumanRealConfigVo.setStatus( arg0.getStatus() );
        aihumanRealConfigVo.setPublish( arg0.getPublish() );
        aihumanRealConfigVo.setRunParams( arg0.getRunParams() );
        aihumanRealConfigVo.setRunStatus( arg0.getRunStatus() );
        aihumanRealConfigVo.setCreateDept( arg0.getCreateDept() );
        aihumanRealConfigVo.setCreateBy( arg0.getCreateBy() );
        aihumanRealConfigVo.setUpdateBy( arg0.getUpdateBy() );

        return aihumanRealConfigVo;
    }

    @Override
    public AihumanRealConfigVo convert(AihumanRealConfig arg0, AihumanRealConfigVo arg1) {
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
