package org.ruoyi.generator.domain.bo;

import javax.annotation.processing.Generated;
import org.ruoyi.generator.domain.Schema;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:43:46+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class SchemaBoToSchemaMapperImpl implements SchemaBoToSchemaMapper {

    @Override
    public Schema convert(SchemaBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        Schema schema = new Schema();

        schema.setId( arg0.getId() );
        schema.setSchemaGroupId( arg0.getSchemaGroupId() );
        schema.setName( arg0.getName() );
        schema.setTableName( arg0.getTableName() );
        schema.setRemark( arg0.getRemark() );

        return schema;
    }

    @Override
    public Schema convert(SchemaBo arg0, Schema arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setSchemaGroupId( arg0.getSchemaGroupId() );
        arg1.setName( arg0.getName() );
        arg1.setTableName( arg0.getTableName() );
        arg1.setRemark( arg0.getRemark() );

        return arg1;
    }
}
