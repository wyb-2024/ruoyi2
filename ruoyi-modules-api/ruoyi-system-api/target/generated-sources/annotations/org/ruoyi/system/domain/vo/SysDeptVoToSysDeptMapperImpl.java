package org.ruoyi.system.domain.vo;

import javax.annotation.processing.Generated;
import org.ruoyi.system.domain.SysDept;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:42:54+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class SysDeptVoToSysDeptMapperImpl implements SysDeptVoToSysDeptMapper {

    @Override
    public SysDept convert(SysDeptVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysDept sysDept = new SysDept();

        sysDept.setCreateTime( arg0.getCreateTime() );
        sysDept.setDeptId( arg0.getDeptId() );
        sysDept.setParentId( arg0.getParentId() );
        sysDept.setDeptName( arg0.getDeptName() );
        sysDept.setOrderNum( arg0.getOrderNum() );
        sysDept.setLeader( arg0.getLeader() );
        sysDept.setPhone( arg0.getPhone() );
        sysDept.setEmail( arg0.getEmail() );
        sysDept.setStatus( arg0.getStatus() );
        sysDept.setAncestors( arg0.getAncestors() );

        return sysDept;
    }

    @Override
    public SysDept convert(SysDeptVo arg0, SysDept arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setCreateTime( arg0.getCreateTime() );
        arg1.setDeptId( arg0.getDeptId() );
        arg1.setParentId( arg0.getParentId() );
        arg1.setDeptName( arg0.getDeptName() );
        arg1.setOrderNum( arg0.getOrderNum() );
        arg1.setLeader( arg0.getLeader() );
        arg1.setPhone( arg0.getPhone() );
        arg1.setEmail( arg0.getEmail() );
        arg1.setStatus( arg0.getStatus() );
        arg1.setAncestors( arg0.getAncestors() );

        return arg1;
    }
}
