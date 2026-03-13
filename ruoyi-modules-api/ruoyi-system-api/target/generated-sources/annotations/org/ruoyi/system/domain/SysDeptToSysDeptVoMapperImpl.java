package org.ruoyi.system.domain;

import javax.annotation.processing.Generated;
import org.ruoyi.system.domain.vo.SysDeptVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:42:55+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class SysDeptToSysDeptVoMapperImpl implements SysDeptToSysDeptVoMapper {

    @Override
    public SysDeptVo convert(SysDept arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysDeptVo sysDeptVo = new SysDeptVo();

        sysDeptVo.setDeptId( arg0.getDeptId() );
        sysDeptVo.setParentId( arg0.getParentId() );
        sysDeptVo.setAncestors( arg0.getAncestors() );
        sysDeptVo.setDeptName( arg0.getDeptName() );
        sysDeptVo.setOrderNum( arg0.getOrderNum() );
        sysDeptVo.setLeader( arg0.getLeader() );
        sysDeptVo.setPhone( arg0.getPhone() );
        sysDeptVo.setEmail( arg0.getEmail() );
        sysDeptVo.setStatus( arg0.getStatus() );
        sysDeptVo.setCreateTime( arg0.getCreateTime() );

        return sysDeptVo;
    }

    @Override
    public SysDeptVo convert(SysDept arg0, SysDeptVo arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setDeptId( arg0.getDeptId() );
        arg1.setParentId( arg0.getParentId() );
        arg1.setAncestors( arg0.getAncestors() );
        arg1.setDeptName( arg0.getDeptName() );
        arg1.setOrderNum( arg0.getOrderNum() );
        arg1.setLeader( arg0.getLeader() );
        arg1.setPhone( arg0.getPhone() );
        arg1.setEmail( arg0.getEmail() );
        arg1.setStatus( arg0.getStatus() );
        arg1.setCreateTime( arg0.getCreateTime() );

        return arg1;
    }
}
