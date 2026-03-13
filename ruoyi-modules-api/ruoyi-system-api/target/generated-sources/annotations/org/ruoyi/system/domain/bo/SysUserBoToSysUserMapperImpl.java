package org.ruoyi.system.domain.bo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.ruoyi.system.domain.SysUser;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:42:55+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class SysUserBoToSysUserMapperImpl implements SysUserBoToSysUserMapper {

    @Override
    public SysUser convert(SysUserBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysUser sysUser = new SysUser();

        sysUser.setSearchValue( arg0.getSearchValue() );
        sysUser.setCreateDept( arg0.getCreateDept() );
        sysUser.setCreateBy( arg0.getCreateBy() );
        sysUser.setCreateTime( arg0.getCreateTime() );
        sysUser.setUpdateBy( arg0.getUpdateBy() );
        sysUser.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            sysUser.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        sysUser.setUserId( arg0.getUserId() );
        sysUser.setDeptId( arg0.getDeptId() );
        sysUser.setUserName( arg0.getUserName() );
        sysUser.setUserPlan( arg0.getUserPlan() );
        sysUser.setNickName( arg0.getNickName() );
        sysUser.setUserType( arg0.getUserType() );
        sysUser.setEmail( arg0.getEmail() );
        sysUser.setPhonenumber( arg0.getPhonenumber() );
        sysUser.setSex( arg0.getSex() );
        sysUser.setAvatar( arg0.getAvatar() );
        sysUser.setPassword( arg0.getPassword() );
        sysUser.setStatus( arg0.getStatus() );
        sysUser.setDomainName( arg0.getDomainName() );
        sysUser.setRemark( arg0.getRemark() );
        sysUser.setOpenId( arg0.getOpenId() );
        sysUser.setUserBalance( arg0.getUserBalance() );
        sysUser.setUserGrade( arg0.getUserGrade() );
        sysUser.setKroleGroupType( arg0.getKroleGroupType() );
        sysUser.setKroleGroupIds( arg0.getKroleGroupIds() );

        return sysUser;
    }

    @Override
    public SysUser convert(SysUserBo arg0, SysUser arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setSearchValue( arg0.getSearchValue() );
        arg1.setCreateDept( arg0.getCreateDept() );
        arg1.setCreateBy( arg0.getCreateBy() );
        arg1.setCreateTime( arg0.getCreateTime() );
        arg1.setUpdateBy( arg0.getUpdateBy() );
        arg1.setUpdateTime( arg0.getUpdateTime() );
        if ( arg1.getParams() != null ) {
            Map<String, Object> map = arg0.getParams();
            if ( map != null ) {
                arg1.getParams().clear();
                arg1.getParams().putAll( map );
            }
            else {
                arg1.setParams( null );
            }
        }
        else {
            Map<String, Object> map = arg0.getParams();
            if ( map != null ) {
                arg1.setParams( new LinkedHashMap<String, Object>( map ) );
            }
        }
        arg1.setUserId( arg0.getUserId() );
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
        arg1.setDomainName( arg0.getDomainName() );
        arg1.setRemark( arg0.getRemark() );
        arg1.setOpenId( arg0.getOpenId() );
        arg1.setUserBalance( arg0.getUserBalance() );
        arg1.setUserGrade( arg0.getUserGrade() );
        arg1.setKroleGroupType( arg0.getKroleGroupType() );
        arg1.setKroleGroupIds( arg0.getKroleGroupIds() );

        return arg1;
    }
}
