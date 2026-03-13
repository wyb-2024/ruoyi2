package org.ruoyi.common.log.event;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.ruoyi.system.domain.bo.SysOperLogBo;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {}
)
public interface OperLogEventToSysOperLogBoMapper extends BaseMapper<OperLogEvent, SysOperLogBo> {
}
