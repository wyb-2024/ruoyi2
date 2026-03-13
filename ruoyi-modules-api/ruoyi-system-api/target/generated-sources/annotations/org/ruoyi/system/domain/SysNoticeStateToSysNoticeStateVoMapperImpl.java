package org.ruoyi.system.domain;

import javax.annotation.processing.Generated;
import org.ruoyi.system.domain.vo.SysNoticeStateVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:42:54+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class SysNoticeStateToSysNoticeStateVoMapperImpl implements SysNoticeStateToSysNoticeStateVoMapper {

    @Override
    public SysNoticeStateVo convert(SysNoticeState arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysNoticeStateVo sysNoticeStateVo = new SysNoticeStateVo();

        sysNoticeStateVo.setId( arg0.getId() );
        sysNoticeStateVo.setUserId( arg0.getUserId() );
        sysNoticeStateVo.setNoticeId( arg0.getNoticeId() );
        sysNoticeStateVo.setReadStatus( arg0.getReadStatus() );
        sysNoticeStateVo.setRemark( arg0.getRemark() );

        return sysNoticeStateVo;
    }

    @Override
    public SysNoticeStateVo convert(SysNoticeState arg0, SysNoticeStateVo arg1) {
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
