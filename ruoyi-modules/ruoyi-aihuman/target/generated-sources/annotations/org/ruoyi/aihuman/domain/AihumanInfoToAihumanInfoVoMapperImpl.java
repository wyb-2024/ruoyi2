package org.ruoyi.aihuman.domain;

import javax.annotation.processing.Generated;
import org.ruoyi.aihuman.domain.vo.AihumanInfoVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:44:08+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class AihumanInfoToAihumanInfoVoMapperImpl implements AihumanInfoToAihumanInfoVoMapper {

    @Override
    public AihumanInfoVo convert(AihumanInfo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AihumanInfoVo aihumanInfoVo = new AihumanInfoVo();

        aihumanInfoVo.setId( arg0.getId() );
        aihumanInfoVo.setName( arg0.getName() );
        aihumanInfoVo.setContent( arg0.getContent() );
        aihumanInfoVo.setCreateTime( arg0.getCreateTime() );
        aihumanInfoVo.setUpdateTime( arg0.getUpdateTime() );

        return aihumanInfoVo;
    }

    @Override
    public AihumanInfoVo convert(AihumanInfo arg0, AihumanInfoVo arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setName( arg0.getName() );
        arg1.setContent( arg0.getContent() );
        arg1.setCreateTime( arg0.getCreateTime() );
        arg1.setUpdateTime( arg0.getUpdateTime() );

        return arg1;
    }
}
