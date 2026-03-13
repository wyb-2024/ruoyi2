package org.ruoyi.aihuman.domain.bo;

import java.time.ZoneOffset;
import java.util.Date;
import javax.annotation.processing.Generated;
import org.ruoyi.aihuman.domain.AihumanInfo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:44:08+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class AihumanInfoBoToAihumanInfoMapperImpl implements AihumanInfoBoToAihumanInfoMapper {

    @Override
    public AihumanInfo convert(AihumanInfoBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AihumanInfo aihumanInfo = new AihumanInfo();

        aihumanInfo.setId( arg0.getId() );
        aihumanInfo.setName( arg0.getName() );
        aihumanInfo.setContent( arg0.getContent() );
        if ( arg0.getCreateTime() != null ) {
            aihumanInfo.setCreateTime( Date.from( arg0.getCreateTime().toInstant( ZoneOffset.UTC ) ) );
        }
        if ( arg0.getUpdateTime() != null ) {
            aihumanInfo.setUpdateTime( Date.from( arg0.getUpdateTime().toInstant( ZoneOffset.UTC ) ) );
        }
        aihumanInfo.setDelFlag( arg0.getDelFlag() );

        return aihumanInfo;
    }

    @Override
    public AihumanInfo convert(AihumanInfoBo arg0, AihumanInfo arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setName( arg0.getName() );
        arg1.setContent( arg0.getContent() );
        if ( arg0.getCreateTime() != null ) {
            arg1.setCreateTime( Date.from( arg0.getCreateTime().toInstant( ZoneOffset.UTC ) ) );
        }
        else {
            arg1.setCreateTime( null );
        }
        if ( arg0.getUpdateTime() != null ) {
            arg1.setUpdateTime( Date.from( arg0.getUpdateTime().toInstant( ZoneOffset.UTC ) ) );
        }
        else {
            arg1.setUpdateTime( null );
        }
        arg1.setDelFlag( arg0.getDelFlag() );

        return arg1;
    }
}
