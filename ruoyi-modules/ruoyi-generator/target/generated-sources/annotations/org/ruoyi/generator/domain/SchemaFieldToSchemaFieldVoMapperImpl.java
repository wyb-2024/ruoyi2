package org.ruoyi.generator.domain;

import javax.annotation.processing.Generated;
import org.ruoyi.generator.domain.vo.SchemaFieldVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:43:45+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class SchemaFieldToSchemaFieldVoMapperImpl implements SchemaFieldToSchemaFieldVoMapper {

    @Override
    public SchemaFieldVo convert(SchemaField arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SchemaFieldVo schemaFieldVo = new SchemaFieldVo();

        schemaFieldVo.setId( arg0.getId() );
        schemaFieldVo.setSchemaId( arg0.getSchemaId() );
        schemaFieldVo.setSchemaName( arg0.getSchemaName() );
        schemaFieldVo.setName( arg0.getName() );
        schemaFieldVo.setCode( arg0.getCode() );
        schemaFieldVo.setType( arg0.getType() );
        schemaFieldVo.setComment( arg0.getComment() );
        schemaFieldVo.setIsPk( arg0.getIsPk() );
        schemaFieldVo.setIsRequired( arg0.getIsRequired() );
        schemaFieldVo.setIsUnique( arg0.getIsUnique() );
        schemaFieldVo.setDefaultValue( arg0.getDefaultValue() );
        schemaFieldVo.setLength( arg0.getLength() );
        schemaFieldVo.setScale( arg0.getScale() );
        schemaFieldVo.setSort( arg0.getSort() );
        schemaFieldVo.setIsList( arg0.getIsList() );
        schemaFieldVo.setIsQuery( arg0.getIsQuery() );
        schemaFieldVo.setIsInsert( arg0.getIsInsert() );
        schemaFieldVo.setIsEdit( arg0.getIsEdit() );
        schemaFieldVo.setQueryType( arg0.getQueryType() );
        schemaFieldVo.setHtmlType( arg0.getHtmlType() );
        schemaFieldVo.setDictType( arg0.getDictType() );
        schemaFieldVo.setRemark( arg0.getRemark() );

        return schemaFieldVo;
    }

    @Override
    public SchemaFieldVo convert(SchemaField arg0, SchemaFieldVo arg1) {
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
