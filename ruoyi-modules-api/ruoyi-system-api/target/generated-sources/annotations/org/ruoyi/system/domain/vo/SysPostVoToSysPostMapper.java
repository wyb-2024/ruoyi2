package org.ruoyi.system.domain.vo;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.ruoyi.system.domain.SysPost;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {}
)
public interface SysPostVoToSysPostMapper extends BaseMapper<SysPostVo, SysPost> {
}
