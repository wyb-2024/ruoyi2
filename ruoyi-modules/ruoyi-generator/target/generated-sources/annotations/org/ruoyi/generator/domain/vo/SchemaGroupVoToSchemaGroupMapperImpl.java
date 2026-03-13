package org.ruoyi.generator.domain.vo;

import javax.annotation.processing.Generated;
import org.ruoyi.generator.domain.SchemaGroup;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:43:45+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class SchemaGroupVoToSchemaGroupMapperImpl implements SchemaGroupVoToSchemaGroupMapper {

    @Override
    public SchemaGroup convert(SchemaGroupVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SchemaGroup schemaGroup = new SchemaGroup();

        schemaGroup.setId( arg0.getId() );
        schemaGroup.setName( arg0.getName() );
        schemaGroup.setCode( arg0.getCode() );
        schemaGroup.setIcon( arg0.getIcon() );
        schemaGroup.setRemark( arg0.getRemark() );
        schemaGroup.setCreateTime( arg0.getCreateTime() );

        return schemaGroup;
    }

    @Override
    public SchemaGroup convert(SchemaGroupVo arg0, SchemaGroup arg1) {
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
