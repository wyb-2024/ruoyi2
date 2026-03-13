package org.ruoyi.generator.domain.vo;

import javax.annotation.processing.Generated;
import org.ruoyi.generator.domain.Schema;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:43:45+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class SchemaVoToSchemaMapperImpl implements SchemaVoToSchemaMapper {

    @Override
    public Schema convert(SchemaVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        Schema schema = new Schema();

        schema.setId( arg0.getId() );
        schema.setSchemaGroupId( arg0.getSchemaGroupId() );
        schema.setName( arg0.getName() );
        schema.setCode( arg0.getCode() );
        schema.setTableName( arg0.getTableName() );
        schema.setRemark( arg0.getRemark() );
        schema.setCreateTime( arg0.getCreateTime() );

        return schema;
    }

    @Override
    public Schema convert(SchemaVo arg0, Schema arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setSchemaGroupId( arg0.getSchemaGroupId() );
        arg1.setName( arg0.getName() );
        arg1.setCode( arg0.getCode() );
        arg1.setTableName( arg0.getTableName() );
        arg1.setRemark( arg0.getRemark() );
        arg1.setCreateTime( arg0.getCreateTime() );

        return arg1;
    }
}
