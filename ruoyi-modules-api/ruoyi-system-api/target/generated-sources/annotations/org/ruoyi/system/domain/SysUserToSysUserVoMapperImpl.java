package org.ruoyi.system.domain;

import javax.annotation.processing.Generated;
import org.ruoyi.system.domain.vo.SysUserVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:42:54+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class SysUserToSysUserVoMapperImpl implements SysUserToSysUserVoMapper {

    @Override
    public SysUserVo convert(SysUser arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysUserVo sysUserVo = new SysUserVo();

        sysUserVo.setUserId( arg0.getUserId() );
        sysUserVo.setTenantId( arg0.getTenantId() );
        sysUserVo.setDeptId( arg0.getDeptId() );
        sysUserVo.setUserName( arg0.getUserName() );
        sysUserVo.setUserPlan( arg0.getUserPlan() );
        sysUserVo.setNickName( arg0.getNickName() );
        sysUserVo.setUserType( arg0.getUserType() );
        sysUserVo.setEmail( arg0.getEmail() );
        sysUserVo.setPhonenumber( arg0.getPhonenumber() );
        sysUserVo.setSex( arg0.getSex() );
        sysUserVo.setAvatar( arg0.getAvatar() );
        sysUserVo.setPassword( arg0.getPassword() );
        sysUserVo.setStatus( arg0.getStatus() );
        sysUserVo.setLoginIp( arg0.getLoginIp() );
        sysUserVo.setLoginDate( arg0.getLoginDate() );
        sysUserVo.setRemark( arg0.getRemark() );
        sysUserVo.setCreateTime( arg0.getCreateTime() );
        sysUserVo.setDomainName( arg0.getDomainName() );
        sysUserVo.setUserGrade( arg0.getUserGrade() );
        sysUserVo.setUserBalance( arg0.getUserBalance() );
        sysUserVo.setKroleGroupType( arg0.getKroleGroupType() );
        sysUserVo.setKroleGroupIds( arg0.getKroleGroupIds() );

        return sysUserVo;
    }

    @Override
    public SysUserVo convert(SysUser arg0, SysUserVo arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setUserId( arg0.getUserId() );
        arg1.setTenantId( arg0.getTenantId() );
        arg1.setDeptId( arg0.getDeptId() );
        arg1.setUserName( arg0.getUserName() );
        arg1.setUserPlan( arg0.getUserPlan() );
        arg1.setNickName( arg0.getNickName() );
        arg1.setUserType( arg0.getUserType() );
        arg1.setEmail( arg0.getEmail() );
        arg1.setPhonenumber( arg0.getPhonenumber() );
        arg1.setSex( arg0.getSex() );
        arg1.setAvatar( arg0.getAvatar() );
        arg1.setPassword( arg0.getPassword() );
        arg1.setStatus( arg0.getStatus() );
        arg1.setLoginIp( arg0.getLoginIp() );
        arg1.setLoginDate( arg0.getLoginDate() );
        arg1.setRemark( arg0.getRemark() );
        arg1.setCreateTime( arg0.getCreateTime() );
        arg1.setDomainName( arg0.getDomainName() );
        arg1.setUserGrade( arg0.getUserGrade() );
        arg1.setUserBalance( arg0.getUserBalance() );
        arg1.setKroleGroupType( arg0.getKroleGroupType() );
        arg1.setKroleGroupIds( arg0.getKroleGroupIds() );

        return arg1;
    }
}
