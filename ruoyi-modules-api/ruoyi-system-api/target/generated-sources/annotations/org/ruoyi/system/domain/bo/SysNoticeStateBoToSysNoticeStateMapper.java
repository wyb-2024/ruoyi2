package org.ruoyi.system.domain.bo;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.ruoyi.system.domain.SysNoticeState;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {}
)
public interface SysNoticeStateBoToSysNoticeStateMapper extends BaseMapper<SysNoticeStateBo, SysNoticeState> {
}
