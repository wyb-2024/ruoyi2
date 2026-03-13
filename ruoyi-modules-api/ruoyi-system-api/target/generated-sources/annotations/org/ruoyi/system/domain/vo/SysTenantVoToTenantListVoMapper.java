package org.ruoyi.system.domain.vo;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {}
)
public interface SysTenantVoToTenantListVoMapper extends BaseMapper<SysTenantVo, TenantListVo> {
}
