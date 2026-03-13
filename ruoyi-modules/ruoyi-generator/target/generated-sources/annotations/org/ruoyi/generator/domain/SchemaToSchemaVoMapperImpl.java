package org.ruoyi.generator.domain;

import javax.annotation.processing.Generated;
import org.ruoyi.generator.domain.vo.SchemaVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:43:46+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class SchemaToSchemaVoMapperImpl implements SchemaToSchemaVoMapper {

    @Override
    public SchemaVo convert(Schema arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SchemaVo schemaVo = new SchemaVo();

        schemaVo.setId( arg0.getId() );
        schemaVo.setSchemaGroupId( arg0.getSchemaGroupId() );
        schemaVo.setName( arg0.getName() );
        schemaVo.setCode( arg0.getCode() );
        schemaVo.setTableName( arg0.getTableName() );
        schemaVo.setRemark( arg0.getRemark() );
        schemaVo.setCreateTime( arg0.getCreateTime() );

        return schemaVo;
    }

    @Override
    public SchemaVo convert(Schema arg0, SchemaVo arg1) {
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
