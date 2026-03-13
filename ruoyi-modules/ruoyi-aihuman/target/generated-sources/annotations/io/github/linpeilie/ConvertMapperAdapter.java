package io.github.linpeilie;

import org.ruoyi.aihuman.domain.AihumanConfig;
import org.ruoyi.aihuman.domain.AihumanConfigToAihumanConfigVoMapper;
import org.ruoyi.aihuman.domain.AihumanInfo;
import org.ruoyi.aihuman.domain.AihumanInfoToAihumanInfoVoMapper;
import org.ruoyi.aihuman.domain.AihumanRealConfig;
import org.ruoyi.aihuman.domain.AihumanRealConfigToAihumanRealConfigVoMapper;
import org.ruoyi.aihuman.domain.bo.AihumanConfigBo;
import org.ruoyi.aihuman.domain.bo.AihumanConfigBoToAihumanConfigMapper;
import org.ruoyi.aihuman.domain.bo.AihumanInfoBo;
import org.ruoyi.aihuman.domain.bo.AihumanInfoBoToAihumanInfoMapper;
import org.ruoyi.aihuman.domain.bo.AihumanRealConfigBo;
import org.ruoyi.aihuman.domain.bo.AihumanRealConfigBoToAihumanRealConfigMapper;
import org.ruoyi.aihuman.domain.vo.AihumanConfigVo;
import org.ruoyi.aihuman.domain.vo.AihumanConfigVoToAihumanConfigMapper;
import org.ruoyi.aihuman.domain.vo.AihumanInfoVo;
import org.ruoyi.aihuman.domain.vo.AihumanInfoVoToAihumanInfoMapper;
import org.ruoyi.aihuman.domain.vo.AihumanRealConfigVo;
import org.ruoyi.aihuman.domain.vo.AihumanRealConfigVoToAihumanRealConfigMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class ConvertMapperAdapter {
  private AihumanInfoToAihumanInfoVoMapper aihumanInfoToAihumanInfoVoMapper;

  private AihumanRealConfigToAihumanRealConfigVoMapper aihumanRealConfigToAihumanRealConfigVoMapper;

  private AihumanInfoBoToAihumanInfoMapper aihumanInfoBoToAihumanInfoMapper;

  private AihumanConfigBoToAihumanConfigMapper aihumanConfigBoToAihumanConfigMapper;

  private AihumanConfigVoToAihumanConfigMapper aihumanConfigVoToAihumanConfigMapper;

  private AihumanRealConfigVoToAihumanRealConfigMapper aihumanRealConfigVoToAihumanRealConfigMapper;

  private AihumanRealConfigBoToAihumanRealConfigMapper aihumanRealConfigBoToAihumanRealConfigMapper;

  private AihumanInfoVoToAihumanInfoMapper aihumanInfoVoToAihumanInfoMapper;

  private AihumanConfigToAihumanConfigVoMapper aihumanConfigToAihumanConfigVoMapper;

  @Autowired
  public void setAihumanInfoToAihumanInfoVoMapper(@Lazy AihumanInfoToAihumanInfoVoMapper aihumanInfoToAihumanInfoVoMapper) {
    this.aihumanInfoToAihumanInfoVoMapper = aihumanInfoToAihumanInfoVoMapper;
  }

  @Autowired
  public void setAihumanRealConfigToAihumanRealConfigVoMapper(@Lazy AihumanRealConfigToAihumanRealConfigVoMapper aihumanRealConfigToAihumanRealConfigVoMapper) {
    this.aihumanRealConfigToAihumanRealConfigVoMapper = aihumanRealConfigToAihumanRealConfigVoMapper;
  }

  @Autowired
  public void setAihumanInfoBoToAihumanInfoMapper(@Lazy AihumanInfoBoToAihumanInfoMapper aihumanInfoBoToAihumanInfoMapper) {
    this.aihumanInfoBoToAihumanInfoMapper = aihumanInfoBoToAihumanInfoMapper;
  }

  @Autowired
  public void setAihumanConfigBoToAihumanConfigMapper(@Lazy AihumanConfigBoToAihumanConfigMapper aihumanConfigBoToAihumanConfigMapper) {
    this.aihumanConfigBoToAihumanConfigMapper = aihumanConfigBoToAihumanConfigMapper;
  }

  @Autowired
  public void setAihumanConfigVoToAihumanConfigMapper(@Lazy AihumanConfigVoToAihumanConfigMapper aihumanConfigVoToAihumanConfigMapper) {
    this.aihumanConfigVoToAihumanConfigMapper = aihumanConfigVoToAihumanConfigMapper;
  }

  @Autowired
  public void setAihumanRealConfigVoToAihumanRealConfigMapper(@Lazy AihumanRealConfigVoToAihumanRealConfigMapper aihumanRealConfigVoToAihumanRealConfigMapper) {
    this.aihumanRealConfigVoToAihumanRealConfigMapper = aihumanRealConfigVoToAihumanRealConfigMapper;
  }

  @Autowired
  public void setAihumanRealConfigBoToAihumanRealConfigMapper(@Lazy AihumanRealConfigBoToAihumanRealConfigMapper aihumanRealConfigBoToAihumanRealConfigMapper) {
    this.aihumanRealConfigBoToAihumanRealConfigMapper = aihumanRealConfigBoToAihumanRealConfigMapper;
  }

  @Autowired
  public void setAihumanInfoVoToAihumanInfoMapper(@Lazy AihumanInfoVoToAihumanInfoMapper aihumanInfoVoToAihumanInfoMapper) {
    this.aihumanInfoVoToAihumanInfoMapper = aihumanInfoVoToAihumanInfoMapper;
  }

  @Autowired
  public void setAihumanConfigToAihumanConfigVoMapper(@Lazy AihumanConfigToAihumanConfigVoMapper aihumanConfigToAihumanConfigVoMapper) {
    this.aihumanConfigToAihumanConfigVoMapper = aihumanConfigToAihumanConfigVoMapper;
  }

  public AihumanInfoVo aihumanInfoToAihumanInfoVo(AihumanInfo aihumanInfo) {
    return aihumanInfoToAihumanInfoVoMapper.convert(aihumanInfo);
  }

  public AihumanRealConfigVo aihumanRealConfigToAihumanRealConfigVo(AihumanRealConfig aihumanRealConfig) {
    return aihumanRealConfigToAihumanRealConfigVoMapper.convert(aihumanRealConfig);
  }

  public AihumanInfo aihumanInfoBoToAihumanInfo(AihumanInfoBo aihumanInfoBo) {
    return aihumanInfoBoToAihumanInfoMapper.convert(aihumanInfoBo);
  }

  public AihumanConfig aihumanConfigBoToAihumanConfig(AihumanConfigBo aihumanConfigBo) {
    return aihumanConfigBoToAihumanConfigMapper.convert(aihumanConfigBo);
  }

  public AihumanConfig aihumanConfigVoToAihumanConfig(AihumanConfigVo aihumanConfigVo) {
    return aihumanConfigVoToAihumanConfigMapper.convert(aihumanConfigVo);
  }

  public AihumanRealConfig aihumanRealConfigVoToAihumanRealConfig(AihumanRealConfigVo aihumanRealConfigVo) {
    return aihumanRealConfigVoToAihumanRealConfigMapper.convert(aihumanRealConfigVo);
  }

  public AihumanRealConfig aihumanRealConfigBoToAihumanRealConfig(AihumanRealConfigBo aihumanRealConfigBo) {
    return aihumanRealConfigBoToAihumanRealConfigMapper.convert(aihumanRealConfigBo);
  }

  public AihumanInfo aihumanInfoVoToAihumanInfo(AihumanInfoVo aihumanInfoVo) {
    return aihumanInfoVoToAihumanInfoMapper.convert(aihumanInfoVo);
  }

  public AihumanConfigVo aihumanConfigToAihumanConfigVo(AihumanConfig aihumanConfig) {
    return aihumanConfigToAihumanConfigVoMapper.convert(aihumanConfig);
  }
}
