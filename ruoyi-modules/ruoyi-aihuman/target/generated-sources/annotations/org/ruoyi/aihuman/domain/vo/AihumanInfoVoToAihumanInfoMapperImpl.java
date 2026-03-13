package org.ruoyi.aihuman.domain.vo;

import javax.annotation.processing.Generated;
import org.ruoyi.aihuman.domain.AihumanInfo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:44:07+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class AihumanInfoVoToAihumanInfoMapperImpl implements AihumanInfoVoToAihumanInfoMapper {

    @Override
    public AihumanInfo convert(AihumanInfoVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AihumanInfo aihumanInfo = new AihumanInfo();

        aihumanInfo.setId( arg0.getId() );
        aihumanInfo.setName( arg0.getName() );
        aihumanInfo.setContent( arg0.getContent() );
        aihumanInfo.setCreateTime( arg0.getCreateTime() );
        aihumanInfo.setUpdateTime( arg0.getUpdateTime() );

        return aihumanInfo;
    }

    @Override
    public AihumanInfo convert(AihumanInfoVo arg0, AihumanInfo arg1) {
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
