package org.ruoyi.system.domain.vo;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:42:54+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class SysTenantVoToTenantListVoMapperImpl implements SysTenantVoToTenantListVoMapper {

    @Override
    public TenantListVo convert(SysTenantVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TenantListVo tenantListVo = new TenantListVo();

        tenantListVo.setTenantId( arg0.getTenantId() );
        tenantListVo.setCompanyName( arg0.getCompanyName() );
        tenantListVo.setDomain( arg0.getDomain() );

        return tenantListVo;
    }

    @Override
    public TenantListVo convert(SysTenantVo arg0, TenantListVo arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setTenantId( arg0.getTenantId() );
        arg1.setCompanyName( arg0.getCompanyName() );
        arg1.setDomain( arg0.getDomain() );

        return arg1;
    }
}
