package org.ruoyi.system.domain;

import javax.annotation.processing.Generated;
import org.ruoyi.system.domain.vo.SysConfigVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:42:54+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class SysConfigToSysConfigVoMapperImpl implements SysConfigToSysConfigVoMapper {

    @Override
    public SysConfigVo convert(SysConfig arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysConfigVo sysConfigVo = new SysConfigVo();

        sysConfigVo.setConfigId( arg0.getConfigId() );
        sysConfigVo.setConfigName( arg0.getConfigName() );
        sysConfigVo.setConfigKey( arg0.getConfigKey() );
        sysConfigVo.setConfigValue( arg0.getConfigValue() );
        sysConfigVo.setConfigType( arg0.getConfigType() );
        sysConfigVo.setRemark( arg0.getRemark() );
        sysConfigVo.setCreateTime( arg0.getCreateTime() );

        return sysConfigVo;
    }

    @Override
    public SysConfigVo convert(SysConfig arg0, SysConfigVo arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setConfigId( arg0.getConfigId() );
        arg1.setConfigName( arg0.getConfigName() );
        arg1.setConfigKey( arg0.getConfigKey() );
        arg1.setConfigValue( arg0.getConfigValue() );
        arg1.setConfigType( arg0.getConfigType() );
        arg1.setRemark( arg0.getRemark() );
        arg1.setCreateTime( arg0.getCreateTime() );

        return arg1;
    }
}
