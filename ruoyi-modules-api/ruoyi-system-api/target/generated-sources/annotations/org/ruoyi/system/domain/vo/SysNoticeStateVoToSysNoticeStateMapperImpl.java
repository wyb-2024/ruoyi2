package org.ruoyi.system.domain.vo;

import javax.annotation.processing.Generated;
import org.ruoyi.system.domain.SysNoticeState;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:42:54+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class SysNoticeStateVoToSysNoticeStateMapperImpl implements SysNoticeStateVoToSysNoticeStateMapper {

    @Override
    public SysNoticeState convert(SysNoticeStateVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysNoticeState sysNoticeState = new SysNoticeState();

        sysNoticeState.setId( arg0.getId() );
        sysNoticeState.setUserId( arg0.getUserId() );
        sysNoticeState.setNoticeId( arg0.getNoticeId() );
        sysNoticeState.setReadStatus( arg0.getReadStatus() );
        sysNoticeState.setRemark( arg0.getRemark() );

        return sysNoticeState;
    }

    @Override
    public SysNoticeState convert(SysNoticeStateVo arg0, SysNoticeState arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setUserId( arg0.getUserId() );
        arg1.setNoticeId( arg0.getNoticeId() );
        arg1.setReadStatus( arg0.getReadStatus() );
        arg1.setRemark( arg0.getRemark() );

        return arg1;
    }
}
