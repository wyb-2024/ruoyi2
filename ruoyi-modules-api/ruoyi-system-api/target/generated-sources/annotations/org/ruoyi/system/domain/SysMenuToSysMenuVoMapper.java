package org.ruoyi.system.domain;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.ruoyi.system.domain.vo.SysMenuVo;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {}
)
public interface SysMenuToSysMenuVoMapper extends BaseMapper<SysMenu, SysMenuVo> {
}
