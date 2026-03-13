package org.ruoyi.system.domain.bo;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.ruoyi.system.domain.SysTenantPackage;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {}
)
public interface SysTenantPackageBoToSysTenantPackageMapper extends BaseMapper<SysTenantPackageBo, SysTenantPackage> {
  @Mapping(
      target = "menuIds",
      ignore = false,
      expression = "java(org.ruoyi.common.core.utils.StringUtils.join(source.getMenuIds(), \",\"))"
  )
  SysTenantPackage convert(SysTenantPackageBo source);

  @Mapping(
      target = "menuIds",
      ignore = false,
      expression = "java(org.ruoyi.common.core.utils.StringUtils.join(source.getMenuIds(), \",\"))"
  )
  SysTenantPackage convert(SysTenantPackageBo source, @MappingTarget SysTenantPackage target);
}
