package org.ruoyi.system.domain.vo;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.ruoyi.system.domain.SysDictData;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {}
)
public interface SysDictDataVoToSysDictDataMapper extends BaseMapper<SysDictDataVo, SysDictData> {
}
