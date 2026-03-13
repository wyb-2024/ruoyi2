package org.ruoyi.system.domain;

import javax.annotation.processing.Generated;
import org.ruoyi.system.domain.vo.SysNoticeVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:42:54+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class SysNoticeToSysNoticeVoMapperImpl implements SysNoticeToSysNoticeVoMapper {

    @Override
    public SysNoticeVo convert(SysNotice arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysNoticeVo sysNoticeVo = new SysNoticeVo();

        sysNoticeVo.setNoticeId( arg0.getNoticeId() );
        sysNoticeVo.setNoticeTitle( arg0.getNoticeTitle() );
        sysNoticeVo.setNoticeType( arg0.getNoticeType() );
        sysNoticeVo.setNoticeContent( arg0.getNoticeContent() );
        sysNoticeVo.setStatus( arg0.getStatus() );
        sysNoticeVo.setRemark( arg0.getRemark() );

        return sysNoticeVo;
    }

    @Override
    public SysNoticeVo convert(SysNotice arg0, SysNoticeVo arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setNoticeId( arg0.getNoticeId() );
        arg1.setNoticeTitle( arg0.getNoticeTitle() );
        arg1.setNoticeType( arg0.getNoticeType() );
        arg1.setNoticeContent( arg0.getNoticeContent() );
        arg1.setStatus( arg0.getStatus() );
        arg1.setRemark( arg0.getRemark() );

        return arg1;
    }
}
