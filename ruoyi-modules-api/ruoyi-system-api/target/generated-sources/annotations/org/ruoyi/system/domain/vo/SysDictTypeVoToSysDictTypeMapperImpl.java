package org.ruoyi.system.domain.vo;

import javax.annotation.processing.Generated;
import org.ruoyi.system.domain.SysDictType;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:42:55+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class SysDictTypeVoToSysDictTypeMapperImpl implements SysDictTypeVoToSysDictTypeMapper {

    @Override
    public SysDictType convert(SysDictTypeVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysDictType sysDictType = new SysDictType();

        sysDictType.setCreateTime( arg0.getCreateTime() );
        sysDictType.setDictId( arg0.getDictId() );
        sysDictType.setDictName( arg0.getDictName() );
        sysDictType.setDictType( arg0.getDictType() );
        sysDictType.setStatus( arg0.getStatus() );
        sysDictType.setRemark( arg0.getRemark() );

        return sysDictType;
    }

    @Override
    public SysDictType convert(SysDictTypeVo arg0, SysDictType arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setCreateTime( arg0.getCreateTime() );
        arg1.setDictId( arg0.getDictId() );
        arg1.setDictName( arg0.getDictName() );
        arg1.setDictType( arg0.getDictType() );
        arg1.setStatus( arg0.getStatus() );
        arg1.setRemark( arg0.getRemark() );

        return arg1;
    }
}
