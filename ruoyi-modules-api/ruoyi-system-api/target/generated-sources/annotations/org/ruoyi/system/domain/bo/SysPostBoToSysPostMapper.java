package org.ruoyi.system.domain.bo;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.ruoyi.system.domain.SysPost;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {}
)
public interface SysPostBoToSysPostMapper extends BaseMapper<SysPostBo, SysPost> {
}
