package org.ruoyi.system.domain.vo;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:42:55+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class SysUserVoToSysUserExportVoMapperImpl implements SysUserVoToSysUserExportVoMapper {

    @Override
    public SysUserExportVo convert(SysUserVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysUserExportVo sysUserExportVo = new SysUserExportVo();

        sysUserExportVo.setUserId( arg0.getUserId() );
        sysUserExportVo.setUserName( arg0.getUserName() );
        sysUserExportVo.setNickName( arg0.getNickName() );
        sysUserExportVo.setStatus( arg0.getStatus() );
        sysUserExportVo.setUserBalance( arg0.getUserBalance() );
        sysUserExportVo.setUserGrade( arg0.getUserGrade() );
        sysUserExportVo.setLoginDate( arg0.getLoginDate() );

        return sysUserExportVo;
    }

    @Override
    public SysUserExportVo convert(SysUserVo arg0, SysUserExportVo arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setUserId( arg0.getUserId() );
        arg1.setUserName( arg0.getUserName() );
        arg1.setNickName( arg0.getNickName() );
        arg1.setStatus( arg0.getStatus() );
        arg1.setUserBalance( arg0.getUserBalance() );
        arg1.setUserGrade( arg0.getUserGrade() );
        arg1.setLoginDate( arg0.getLoginDate() );

        return arg1;
    }
}
