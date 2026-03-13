package io.github.linpeilie;

import org.ruoyi.domain.KnowledgeAttach;
import org.ruoyi.domain.KnowledgeAttachToKnowledgeAttachVoMapper;
import org.ruoyi.domain.KnowledgeFragment;
import org.ruoyi.domain.KnowledgeFragmentToKnowledgeFragmentVoMapper;
import org.ruoyi.domain.KnowledgeInfo;
import org.ruoyi.domain.KnowledgeInfoToKnowledgeInfoVoMapper;
import org.ruoyi.domain.KnowledgeRole;
import org.ruoyi.domain.KnowledgeRoleGroup;
import org.ruoyi.domain.KnowledgeRoleGroupToKnowledgeRoleGroupVoMapper;
import org.ruoyi.domain.KnowledgeRoleRelation;
import org.ruoyi.domain.KnowledgeRoleRelationToKnowledgeRoleRelationVoMapper;
import org.ruoyi.domain.KnowledgeRoleToKnowledgeRoleVoMapper;
import org.ruoyi.domain.bo.KnowledgeAttachBo;
import org.ruoyi.domain.bo.KnowledgeAttachBoToKnowledgeAttachMapper;
import org.ruoyi.domain.bo.KnowledgeFragmentBo;
import org.ruoyi.domain.bo.KnowledgeFragmentBoToKnowledgeFragmentMapper;
import org.ruoyi.domain.bo.KnowledgeInfoBo;
import org.ruoyi.domain.bo.KnowledgeInfoBoToKnowledgeInfoMapper;
import org.ruoyi.domain.bo.KnowledgeRoleBo;
import org.ruoyi.domain.bo.KnowledgeRoleBoToKnowledgeRoleMapper;
import org.ruoyi.domain.bo.KnowledgeRoleGroupBo;
import org.ruoyi.domain.bo.KnowledgeRoleGroupBoToKnowledgeRoleGroupMapper;
import org.ruoyi.domain.bo.KnowledgeRoleRelationBo;
import org.ruoyi.domain.bo.KnowledgeRoleRelationBoToKnowledgeRoleRelationMapper;
import org.ruoyi.domain.vo.KnowledgeAttachVo;
import org.ruoyi.domain.vo.KnowledgeAttachVoToKnowledgeAttachMapper;
import org.ruoyi.domain.vo.KnowledgeFragmentVo;
import org.ruoyi.domain.vo.KnowledgeFragmentVoToKnowledgeFragmentMapper;
import org.ruoyi.domain.vo.KnowledgeInfoVo;
import org.ruoyi.domain.vo.KnowledgeInfoVoToKnowledgeInfoMapper;
import org.ruoyi.domain.vo.KnowledgeRoleGroupVo;
import org.ruoyi.domain.vo.KnowledgeRoleGroupVoToKnowledgeRoleGroupMapper;
import org.ruoyi.domain.vo.KnowledgeRoleRelationVo;
import org.ruoyi.domain.vo.KnowledgeRoleRelationVoToKnowledgeRoleRelationMapper;
import org.ruoyi.domain.vo.KnowledgeRoleVo;
import org.ruoyi.domain.vo.KnowledgeRoleVoToKnowledgeRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class ConvertMapperAdapter {
  private KnowledgeRoleRelationToKnowledgeRoleRelationVoMapper knowledgeRoleRelationToKnowledgeRoleRelationVoMapper;

  private KnowledgeInfoVoToKnowledgeInfoMapper knowledgeInfoVoToKnowledgeInfoMapper;

  private KnowledgeRoleGroupToKnowledgeRoleGroupVoMapper knowledgeRoleGroupToKnowledgeRoleGroupVoMapper;

  private KnowledgeRoleGroupBoToKnowledgeRoleGroupMapper knowledgeRoleGroupBoToKnowledgeRoleGroupMapper;

  private KnowledgeRoleBoToKnowledgeRoleMapper knowledgeRoleBoToKnowledgeRoleMapper;

  private KnowledgeRoleGroupVoToKnowledgeRoleGroupMapper knowledgeRoleGroupVoToKnowledgeRoleGroupMapper;

  private KnowledgeFragmentVoToKnowledgeFragmentMapper knowledgeFragmentVoToKnowledgeFragmentMapper;

  private KnowledgeInfoToKnowledgeInfoVoMapper knowledgeInfoToKnowledgeInfoVoMapper;

  private KnowledgeRoleRelationBoToKnowledgeRoleRelationMapper knowledgeRoleRelationBoToKnowledgeRoleRelationMapper;

  private KnowledgeAttachToKnowledgeAttachVoMapper knowledgeAttachToKnowledgeAttachVoMapper;

  private KnowledgeRoleToKnowledgeRoleVoMapper knowledgeRoleToKnowledgeRoleVoMapper;

  private KnowledgeFragmentBoToKnowledgeFragmentMapper knowledgeFragmentBoToKnowledgeFragmentMapper;

  private KnowledgeInfoBoToKnowledgeInfoMapper knowledgeInfoBoToKnowledgeInfoMapper;

  private KnowledgeRoleVoToKnowledgeRoleMapper knowledgeRoleVoToKnowledgeRoleMapper;

  private KnowledgeAttachBoToKnowledgeAttachMapper knowledgeAttachBoToKnowledgeAttachMapper;

  private KnowledgeFragmentToKnowledgeFragmentVoMapper knowledgeFragmentToKnowledgeFragmentVoMapper;

  private KnowledgeRoleRelationVoToKnowledgeRoleRelationMapper knowledgeRoleRelationVoToKnowledgeRoleRelationMapper;

  private KnowledgeAttachVoToKnowledgeAttachMapper knowledgeAttachVoToKnowledgeAttachMapper;

  @Autowired
  public void setKnowledgeRoleRelationToKnowledgeRoleRelationVoMapper(@Lazy KnowledgeRoleRelationToKnowledgeRoleRelationVoMapper knowledgeRoleRelationToKnowledgeRoleRelationVoMapper) {
    this.knowledgeRoleRelationToKnowledgeRoleRelationVoMapper = knowledgeRoleRelationToKnowledgeRoleRelationVoMapper;
  }

  @Autowired
  public void setKnowledgeInfoVoToKnowledgeInfoMapper(@Lazy KnowledgeInfoVoToKnowledgeInfoMapper knowledgeInfoVoToKnowledgeInfoMapper) {
    this.knowledgeInfoVoToKnowledgeInfoMapper = knowledgeInfoVoToKnowledgeInfoMapper;
  }

  @Autowired
  public void setKnowledgeRoleGroupToKnowledgeRoleGroupVoMapper(@Lazy KnowledgeRoleGroupToKnowledgeRoleGroupVoMapper knowledgeRoleGroupToKnowledgeRoleGroupVoMapper) {
    this.knowledgeRoleGroupToKnowledgeRoleGroupVoMapper = knowledgeRoleGroupToKnowledgeRoleGroupVoMapper;
  }

  @Autowired
  public void setKnowledgeRoleGroupBoToKnowledgeRoleGroupMapper(@Lazy KnowledgeRoleGroupBoToKnowledgeRoleGroupMapper knowledgeRoleGroupBoToKnowledgeRoleGroupMapper) {
    this.knowledgeRoleGroupBoToKnowledgeRoleGroupMapper = knowledgeRoleGroupBoToKnowledgeRoleGroupMapper;
  }

  @Autowired
  public void setKnowledgeRoleBoToKnowledgeRoleMapper(@Lazy KnowledgeRoleBoToKnowledgeRoleMapper knowledgeRoleBoToKnowledgeRoleMapper) {
    this.knowledgeRoleBoToKnowledgeRoleMapper = knowledgeRoleBoToKnowledgeRoleMapper;
  }

  @Autowired
  public void setKnowledgeRoleGroupVoToKnowledgeRoleGroupMapper(@Lazy KnowledgeRoleGroupVoToKnowledgeRoleGroupMapper knowledgeRoleGroupVoToKnowledgeRoleGroupMapper) {
    this.knowledgeRoleGroupVoToKnowledgeRoleGroupMapper = knowledgeRoleGroupVoToKnowledgeRoleGroupMapper;
  }

  @Autowired
  public void setKnowledgeFragmentVoToKnowledgeFragmentMapper(@Lazy KnowledgeFragmentVoToKnowledgeFragmentMapper knowledgeFragmentVoToKnowledgeFragmentMapper) {
    this.knowledgeFragmentVoToKnowledgeFragmentMapper = knowledgeFragmentVoToKnowledgeFragmentMapper;
  }

  @Autowired
  public void setKnowledgeInfoToKnowledgeInfoVoMapper(@Lazy KnowledgeInfoToKnowledgeInfoVoMapper knowledgeInfoToKnowledgeInfoVoMapper) {
    this.knowledgeInfoToKnowledgeInfoVoMapper = knowledgeInfoToKnowledgeInfoVoMapper;
  }

  @Autowired
  public void setKnowledgeRoleRelationBoToKnowledgeRoleRelationMapper(@Lazy KnowledgeRoleRelationBoToKnowledgeRoleRelationMapper knowledgeRoleRelationBoToKnowledgeRoleRelationMapper) {
    this.knowledgeRoleRelationBoToKnowledgeRoleRelationMapper = knowledgeRoleRelationBoToKnowledgeRoleRelationMapper;
  }

  @Autowired
  public void setKnowledgeAttachToKnowledgeAttachVoMapper(@Lazy KnowledgeAttachToKnowledgeAttachVoMapper knowledgeAttachToKnowledgeAttachVoMapper) {
    this.knowledgeAttachToKnowledgeAttachVoMapper = knowledgeAttachToKnowledgeAttachVoMapper;
  }

  @Autowired
  public void setKnowledgeRoleToKnowledgeRoleVoMapper(@Lazy KnowledgeRoleToKnowledgeRoleVoMapper knowledgeRoleToKnowledgeRoleVoMapper) {
    this.knowledgeRoleToKnowledgeRoleVoMapper = knowledgeRoleToKnowledgeRoleVoMapper;
  }

  @Autowired
  public void setKnowledgeFragmentBoToKnowledgeFragmentMapper(@Lazy KnowledgeFragmentBoToKnowledgeFragmentMapper knowledgeFragmentBoToKnowledgeFragmentMapper) {
    this.knowledgeFragmentBoToKnowledgeFragmentMapper = knowledgeFragmentBoToKnowledgeFragmentMapper;
  }

  @Autowired
  public void setKnowledgeInfoBoToKnowledgeInfoMapper(@Lazy KnowledgeInfoBoToKnowledgeInfoMapper knowledgeInfoBoToKnowledgeInfoMapper) {
    this.knowledgeInfoBoToKnowledgeInfoMapper = knowledgeInfoBoToKnowledgeInfoMapper;
  }

  @Autowired
  public void setKnowledgeRoleVoToKnowledgeRoleMapper(@Lazy KnowledgeRoleVoToKnowledgeRoleMapper knowledgeRoleVoToKnowledgeRoleMapper) {
    this.knowledgeRoleVoToKnowledgeRoleMapper = knowledgeRoleVoToKnowledgeRoleMapper;
  }

  @Autowired
  public void setKnowledgeAttachBoToKnowledgeAttachMapper(@Lazy KnowledgeAttachBoToKnowledgeAttachMapper knowledgeAttachBoToKnowledgeAttachMapper) {
    this.knowledgeAttachBoToKnowledgeAttachMapper = knowledgeAttachBoToKnowledgeAttachMapper;
  }

  @Autowired
  public void setKnowledgeFragmentToKnowledgeFragmentVoMapper(@Lazy KnowledgeFragmentToKnowledgeFragmentVoMapper knowledgeFragmentToKnowledgeFragmentVoMapper) {
    this.knowledgeFragmentToKnowledgeFragmentVoMapper = knowledgeFragmentToKnowledgeFragmentVoMapper;
  }

  @Autowired
  public void setKnowledgeRoleRelationVoToKnowledgeRoleRelationMapper(@Lazy KnowledgeRoleRelationVoToKnowledgeRoleRelationMapper knowledgeRoleRelationVoToKnowledgeRoleRelationMapper) {
    this.knowledgeRoleRelationVoToKnowledgeRoleRelationMapper = knowledgeRoleRelationVoToKnowledgeRoleRelationMapper;
  }

  @Autowired
  public void setKnowledgeAttachVoToKnowledgeAttachMapper(@Lazy KnowledgeAttachVoToKnowledgeAttachMapper knowledgeAttachVoToKnowledgeAttachMapper) {
    this.knowledgeAttachVoToKnowledgeAttachMapper = knowledgeAttachVoToKnowledgeAttachMapper;
  }

  public KnowledgeRoleRelationVo knowledgeRoleRelationToKnowledgeRoleRelationVo(KnowledgeRoleRelation knowledgeRoleRelation) {
    return knowledgeRoleRelationToKnowledgeRoleRelationVoMapper.convert(knowledgeRoleRelation);
  }

  public KnowledgeInfo knowledgeInfoVoToKnowledgeInfo(KnowledgeInfoVo knowledgeInfoVo) {
    return knowledgeInfoVoToKnowledgeInfoMapper.convert(knowledgeInfoVo);
  }

  public KnowledgeRoleGroupVo knowledgeRoleGroupToKnowledgeRoleGroupVo(KnowledgeRoleGroup knowledgeRoleGroup) {
    return knowledgeRoleGroupToKnowledgeRoleGroupVoMapper.convert(knowledgeRoleGroup);
  }

  public KnowledgeRoleGroup knowledgeRoleGroupBoToKnowledgeRoleGroup(KnowledgeRoleGroupBo knowledgeRoleGroupBo) {
    return knowledgeRoleGroupBoToKnowledgeRoleGroupMapper.convert(knowledgeRoleGroupBo);
  }

  public KnowledgeRole knowledgeRoleBoToKnowledgeRole(KnowledgeRoleBo knowledgeRoleBo) {
    return knowledgeRoleBoToKnowledgeRoleMapper.convert(knowledgeRoleBo);
  }

  public KnowledgeRoleGroup knowledgeRoleGroupVoToKnowledgeRoleGroup(KnowledgeRoleGroupVo knowledgeRoleGroupVo) {
    return knowledgeRoleGroupVoToKnowledgeRoleGroupMapper.convert(knowledgeRoleGroupVo);
  }

  public KnowledgeFragment knowledgeFragmentVoToKnowledgeFragment(KnowledgeFragmentVo knowledgeFragmentVo) {
    return knowledgeFragmentVoToKnowledgeFragmentMapper.convert(knowledgeFragmentVo);
  }

  public KnowledgeInfoVo knowledgeInfoToKnowledgeInfoVo(KnowledgeInfo knowledgeInfo) {
    return knowledgeInfoToKnowledgeInfoVoMapper.convert(knowledgeInfo);
  }

  public KnowledgeRoleRelation knowledgeRoleRelationBoToKnowledgeRoleRelation(KnowledgeRoleRelationBo knowledgeRoleRelationBo) {
    return knowledgeRoleRelationBoToKnowledgeRoleRelationMapper.convert(knowledgeRoleRelationBo);
  }

  public KnowledgeAttachVo knowledgeAttachToKnowledgeAttachVo(KnowledgeAttach knowledgeAttach) {
    return knowledgeAttachToKnowledgeAttachVoMapper.convert(knowledgeAttach);
  }

  public KnowledgeRoleVo knowledgeRoleToKnowledgeRoleVo(KnowledgeRole knowledgeRole) {
    return knowledgeRoleToKnowledgeRoleVoMapper.convert(knowledgeRole);
  }

  public KnowledgeFragment knowledgeFragmentBoToKnowledgeFragment(KnowledgeFragmentBo knowledgeFragmentBo) {
    return knowledgeFragmentBoToKnowledgeFragmentMapper.convert(knowledgeFragmentBo);
  }

  public KnowledgeInfo knowledgeInfoBoToKnowledgeInfo(KnowledgeInfoBo knowledgeInfoBo) {
    return knowledgeInfoBoToKnowledgeInfoMapper.convert(knowledgeInfoBo);
  }

  public KnowledgeRole knowledgeRoleVoToKnowledgeRole(KnowledgeRoleVo knowledgeRoleVo) {
    return knowledgeRoleVoToKnowledgeRoleMapper.convert(knowledgeRoleVo);
  }

  public KnowledgeAttach knowledgeAttachBoToKnowledgeAttach(KnowledgeAttachBo knowledgeAttachBo) {
    return knowledgeAttachBoToKnowledgeAttachMapper.convert(knowledgeAttachBo);
  }

  public KnowledgeFragmentVo knowledgeFragmentToKnowledgeFragmentVo(KnowledgeFragment knowledgeFragment) {
    return knowledgeFragmentToKnowledgeFragmentVoMapper.convert(knowledgeFragment);
  }

  public KnowledgeRoleRelation knowledgeRoleRelationVoToKnowledgeRoleRelation(KnowledgeRoleRelationVo knowledgeRoleRelationVo) {
    return knowledgeRoleRelationVoToKnowledgeRoleRelationMapper.convert(knowledgeRoleRelationVo);
  }

  public KnowledgeAttach knowledgeAttachVoToKnowledgeAttach(KnowledgeAttachVo knowledgeAttachVo) {
    return knowledgeAttachVoToKnowledgeAttachMapper.convert(knowledgeAttachVo);
  }
}
