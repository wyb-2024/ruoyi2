package org.ruoyi.system.domain.bo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.ruoyi.system.domain.SysNoticeState;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:42:55+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class SysNoticeStateBoToSysNoticeStateMapperImpl implements SysNoticeStateBoToSysNoticeStateMapper {

    @Override
    public SysNoticeState convert(SysNoticeStateBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysNoticeState sysNoticeState = new SysNoticeState();

        sysNoticeState.setSearchValue( arg0.getSearchValue() );
        sysNoticeState.setCreateDept( arg0.getCreateDept() );
        sysNoticeState.setCreateBy( arg0.getCreateBy() );
        sysNoticeState.setCreateTime( arg0.getCreateTime() );
        sysNoticeState.setUpdateBy( arg0.getUpdateBy() );
        sysNoticeState.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            sysNoticeState.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        sysNoticeState.setId( arg0.getId() );
        sysNoticeState.setUserId( arg0.getUserId() );
        sysNoticeState.setNoticeId( arg0.getNoticeId() );
        sysNoticeState.setReadStatus( arg0.getReadStatus() );
        sysNoticeState.setRemark( arg0.getRemark() );

        return sysNoticeState;
    }

    @Override
    public SysNoticeState convert(SysNoticeStateBo arg0, SysNoticeState arg1) {
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
        arg1.setId( arg0.getId() );
        arg1.setUserId( arg0.getUserId() );
        arg1.setNoticeId( arg0.getNoticeId() );
        arg1.setReadStatus( arg0.getReadStatus() );
        arg1.setRemark( arg0.getRemark() );

        return arg1;
    }
}
