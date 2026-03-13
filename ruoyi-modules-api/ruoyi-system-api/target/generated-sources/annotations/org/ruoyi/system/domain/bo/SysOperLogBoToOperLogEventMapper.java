package org.ruoyi.system.domain.bo;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.ruoyi.common.log.event.OperLogEvent;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {}
)
public interface SysOperLogBoToOperLogEventMapper extends BaseMapper<SysOperLogBo, OperLogEvent> {
}
