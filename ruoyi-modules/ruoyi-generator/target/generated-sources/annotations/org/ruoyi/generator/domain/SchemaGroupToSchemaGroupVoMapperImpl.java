package org.ruoyi.generator.domain;

import javax.annotation.processing.Generated;
import org.ruoyi.generator.domain.vo.SchemaGroupVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:43:46+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class SchemaGroupToSchemaGroupVoMapperImpl implements SchemaGroupToSchemaGroupVoMapper {

    @Override
    public SchemaGroupVo convert(SchemaGroup arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SchemaGroupVo schemaGroupVo = new SchemaGroupVo();

        schemaGroupVo.setId( arg0.getId() );
        schemaGroupVo.setName( arg0.getName() );
        schemaGroupVo.setCode( arg0.getCode() );
        schemaGroupVo.setIcon( arg0.getIcon() );
        schemaGroupVo.setRemark( arg0.getRemark() );
        schemaGroupVo.setCreateTime( arg0.getCreateTime() );

        return schemaGroupVo;
    }

    @Override
    public SchemaGroupVo convert(SchemaGroup arg0, SchemaGroupVo arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setName( arg0.getName() );
        arg1.setCode( arg0.getCode() );
        arg1.setIcon( arg0.getIcon() );
        arg1.setRemark( arg0.getRemark() );
        arg1.setCreateTime( arg0.getCreateTime() );

        return arg1;
    }
}
