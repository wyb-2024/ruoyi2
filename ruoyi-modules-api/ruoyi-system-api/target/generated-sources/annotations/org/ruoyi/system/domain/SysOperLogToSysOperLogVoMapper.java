package org.ruoyi.system.domain;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.ruoyi.system.domain.vo.SysOperLogVo;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {}
)
public interface SysOperLogToSysOperLogVoMapper extends BaseMapper<SysOperLog, SysOperLogVo> {
}
