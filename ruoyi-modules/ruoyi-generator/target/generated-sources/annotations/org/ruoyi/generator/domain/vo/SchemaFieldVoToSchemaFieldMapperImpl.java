package org.ruoyi.generator.domain.vo;

import javax.annotation.processing.Generated;
import org.ruoyi.generator.domain.SchemaField;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:43:46+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class SchemaFieldVoToSchemaFieldMapperImpl implements SchemaFieldVoToSchemaFieldMapper {

    @Override
    public SchemaField convert(SchemaFieldVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SchemaField schemaField = new SchemaField();

        schemaField.setId( arg0.getId() );
        schemaField.setSchemaId( arg0.getSchemaId() );
        schemaField.setSchemaName( arg0.getSchemaName() );
        schemaField.setName( arg0.getName() );
        schemaField.setCode( arg0.getCode() );
        schemaField.setType( arg0.getType() );
        schemaField.setComment( arg0.getComment() );
        schemaField.setIsPk( arg0.getIsPk() );
        schemaField.setIsRequired( arg0.getIsRequired() );
        schemaField.setIsUnique( arg0.getIsUnique() );
        schemaField.setDefaultValue( arg0.getDefaultValue() );
        schemaField.setLength( arg0.getLength() );
        schemaField.setScale( arg0.getScale() );
        schemaField.setSort( arg0.getSort() );
        schemaField.setIsList( arg0.getIsList() );
        schemaField.setIsQuery( arg0.getIsQuery() );
        schemaField.setIsInsert( arg0.getIsInsert() );
        schemaField.setIsEdit( arg0.getIsEdit() );
        schemaField.setQueryType( arg0.getQueryType() );
        schemaField.setHtmlType( arg0.getHtmlType() );
        schemaField.setDictType( arg0.getDictType() );
        schemaField.setRemark( arg0.getRemark() );

        return schemaField;
    }

    @Override
    public SchemaField convert(SchemaFieldVo arg0, SchemaField arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setSchemaId( arg0.getSchemaId() );
        arg1.setSchemaName( arg0.getSchemaName() );
        arg1.setName( arg0.getName() );
        arg1.setCode( arg0.getCode() );
        arg1.setType( arg0.getType() );
        arg1.setComment( arg0.getComment() );
        arg1.setIsPk( arg0.getIsPk() );
        arg1.setIsRequired( arg0.getIsRequired() );
        arg1.setIsUnique( arg0.getIsUnique() );
        arg1.setDefaultValue( arg0.getDefaultValue() );
        arg1.setLength( arg0.getLength() );
        arg1.setScale( arg0.getScale() );
        arg1.setSort( arg0.getSort() );
        arg1.setIsList( arg0.getIsList() );
        arg1.setIsQuery( arg0.getIsQuery() );
        arg1.setIsInsert( arg0.getIsInsert() );
        arg1.setIsEdit( arg0.getIsEdit() );
        arg1.setQueryType( arg0.getQueryType() );
        arg1.setHtmlType( arg0.getHtmlType() );
        arg1.setDictType( arg0.getDictType() );
        arg1.setRemark( arg0.getRemark() );

        return arg1;
    }
}
