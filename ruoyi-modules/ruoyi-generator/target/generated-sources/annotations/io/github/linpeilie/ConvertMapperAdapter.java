package io.github.linpeilie;

import org.ruoyi.generator.domain.Schema;
import org.ruoyi.generator.domain.SchemaField;
import org.ruoyi.generator.domain.SchemaFieldToSchemaFieldVoMapper;
import org.ruoyi.generator.domain.SchemaGroup;
import org.ruoyi.generator.domain.SchemaGroupToSchemaGroupVoMapper;
import org.ruoyi.generator.domain.SchemaToSchemaVoMapper;
import org.ruoyi.generator.domain.bo.SchemaBo;
import org.ruoyi.generator.domain.bo.SchemaBoToSchemaMapper;
import org.ruoyi.generator.domain.bo.SchemaFieldBo;
import org.ruoyi.generator.domain.bo.SchemaFieldBoToSchemaFieldMapper;
import org.ruoyi.generator.domain.bo.SchemaGroupBo;
import org.ruoyi.generator.domain.bo.SchemaGroupBoToSchemaGroupMapper;
import org.ruoyi.generator.domain.vo.SchemaFieldVo;
import org.ruoyi.generator.domain.vo.SchemaFieldVoToSchemaFieldMapper;
import org.ruoyi.generator.domain.vo.SchemaGroupVo;
import org.ruoyi.generator.domain.vo.SchemaGroupVoToSchemaGroupMapper;
import org.ruoyi.generator.domain.vo.SchemaVo;
import org.ruoyi.generator.domain.vo.SchemaVoToSchemaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class ConvertMapperAdapter {
  private SchemaFieldToSchemaFieldVoMapper schemaFieldToSchemaFieldVoMapper;

  private SchemaGroupBoToSchemaGroupMapper schemaGroupBoToSchemaGroupMapper;

  private SchemaGroupVoToSchemaGroupMapper schemaGroupVoToSchemaGroupMapper;

  private SchemaBoToSchemaMapper schemaBoToSchemaMapper;

  private SchemaFieldVoToSchemaFieldMapper schemaFieldVoToSchemaFieldMapper;

  private SchemaToSchemaVoMapper schemaToSchemaVoMapper;

  private SchemaVoToSchemaMapper schemaVoToSchemaMapper;

  private SchemaGroupToSchemaGroupVoMapper schemaGroupToSchemaGroupVoMapper;

  private SchemaFieldBoToSchemaFieldMapper schemaFieldBoToSchemaFieldMapper;

  @Autowired
  public void setSchemaFieldToSchemaFieldVoMapper(@Lazy SchemaFieldToSchemaFieldVoMapper schemaFieldToSchemaFieldVoMapper) {
    this.schemaFieldToSchemaFieldVoMapper = schemaFieldToSchemaFieldVoMapper;
  }

  @Autowired
  public void setSchemaGroupBoToSchemaGroupMapper(@Lazy SchemaGroupBoToSchemaGroupMapper schemaGroupBoToSchemaGroupMapper) {
    this.schemaGroupBoToSchemaGroupMapper = schemaGroupBoToSchemaGroupMapper;
  }

  @Autowired
  public void setSchemaGroupVoToSchemaGroupMapper(@Lazy SchemaGroupVoToSchemaGroupMapper schemaGroupVoToSchemaGroupMapper) {
    this.schemaGroupVoToSchemaGroupMapper = schemaGroupVoToSchemaGroupMapper;
  }

  @Autowired
  public void setSchemaBoToSchemaMapper(@Lazy SchemaBoToSchemaMapper schemaBoToSchemaMapper) {
    this.schemaBoToSchemaMapper = schemaBoToSchemaMapper;
  }

  @Autowired
  public void setSchemaFieldVoToSchemaFieldMapper(@Lazy SchemaFieldVoToSchemaFieldMapper schemaFieldVoToSchemaFieldMapper) {
    this.schemaFieldVoToSchemaFieldMapper = schemaFieldVoToSchemaFieldMapper;
  }

  @Autowired
  public void setSchemaToSchemaVoMapper(@Lazy SchemaToSchemaVoMapper schemaToSchemaVoMapper) {
    this.schemaToSchemaVoMapper = schemaToSchemaVoMapper;
  }

  @Autowired
  public void setSchemaVoToSchemaMapper(@Lazy SchemaVoToSchemaMapper schemaVoToSchemaMapper) {
    this.schemaVoToSchemaMapper = schemaVoToSchemaMapper;
  }

  @Autowired
  public void setSchemaGroupToSchemaGroupVoMapper(@Lazy SchemaGroupToSchemaGroupVoMapper schemaGroupToSchemaGroupVoMapper) {
    this.schemaGroupToSchemaGroupVoMapper = schemaGroupToSchemaGroupVoMapper;
  }

  @Autowired
  public void setSchemaFieldBoToSchemaFieldMapper(@Lazy SchemaFieldBoToSchemaFieldMapper schemaFieldBoToSchemaFieldMapper) {
    this.schemaFieldBoToSchemaFieldMapper = schemaFieldBoToSchemaFieldMapper;
  }

  public SchemaFieldVo schemaFieldToSchemaFieldVo(SchemaField schemaField) {
    return schemaFieldToSchemaFieldVoMapper.convert(schemaField);
  }

  public SchemaGroup schemaGroupBoToSchemaGroup(SchemaGroupBo schemaGroupBo) {
    return schemaGroupBoToSchemaGroupMapper.convert(schemaGroupBo);
  }

  public SchemaGroup schemaGroupVoToSchemaGroup(SchemaGroupVo schemaGroupVo) {
    return schemaGroupVoToSchemaGroupMapper.convert(schemaGroupVo);
  }

  public Schema schemaBoToSchema(SchemaBo schemaBo) {
    return schemaBoToSchemaMapper.convert(schemaBo);
  }

  public SchemaField schemaFieldVoToSchemaField(SchemaFieldVo schemaFieldVo) {
    return schemaFieldVoToSchemaFieldMapper.convert(schemaFieldVo);
  }

  public SchemaVo schemaToSchemaVo(Schema schema) {
    return schemaToSchemaVoMapper.convert(schema);
  }

  public Schema schemaVoToSchema(SchemaVo schemaVo) {
    return schemaVoToSchemaMapper.convert(schemaVo);
  }

  public SchemaGroupVo schemaGroupToSchemaGroupVo(SchemaGroup schemaGroup) {
    return schemaGroupToSchemaGroupVoMapper.convert(schemaGroup);
  }

  public SchemaField schemaFieldBoToSchemaField(SchemaFieldBo schemaFieldBo) {
    return schemaFieldBoToSchemaFieldMapper.convert(schemaFieldBo);
  }
}
