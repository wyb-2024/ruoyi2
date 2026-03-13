package org.ruoyi.system.domain;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.ruoyi.system.domain.vo.SysDictDataVo;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {}
)
public interface SysDictDataToSysDictDataVoMapper extends BaseMapper<SysDictData, SysDictDataVo> {
}
