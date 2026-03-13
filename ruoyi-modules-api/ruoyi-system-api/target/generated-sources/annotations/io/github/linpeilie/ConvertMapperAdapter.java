package io.github.linpeilie;

import org.ruoyi.common.log.event.OperLogEvent;
import org.ruoyi.common.log.event.OperLogEventToSysOperLogBoMapper;
import org.ruoyi.system.domain.ChatConfig;
import org.ruoyi.system.domain.ChatConfigToChatConfigVoMapper;
import org.ruoyi.system.domain.SysConfig;
import org.ruoyi.system.domain.SysConfigToSysConfigVoMapper;
import org.ruoyi.system.domain.SysDept;
import org.ruoyi.system.domain.SysDeptToSysDeptVoMapper;
import org.ruoyi.system.domain.SysDictData;
import org.ruoyi.system.domain.SysDictDataToSysDictDataVoMapper;
import org.ruoyi.system.domain.SysDictType;
import org.ruoyi.system.domain.SysDictTypeToSysDictTypeVoMapper;
import org.ruoyi.system.domain.SysLogininfor;
import org.ruoyi.system.domain.SysLogininforToSysLogininforVoMapper;
import org.ruoyi.system.domain.SysMenu;
import org.ruoyi.system.domain.SysMenuToSysMenuVoMapper;
import org.ruoyi.system.domain.SysNotice;
import org.ruoyi.system.domain.SysNoticeState;
import org.ruoyi.system.domain.SysNoticeStateToSysNoticeStateVoMapper;
import org.ruoyi.system.domain.SysNoticeToSysNoticeVoMapper;
import org.ruoyi.system.domain.SysOperLog;
import org.ruoyi.system.domain.SysOperLogToSysOperLogVoMapper;
import org.ruoyi.system.domain.SysOss;
import org.ruoyi.system.domain.SysOssConfig;
import org.ruoyi.system.domain.SysOssConfigToSysOssConfigVoMapper;
import org.ruoyi.system.domain.SysOssToSysOssVoMapper;
import org.ruoyi.system.domain.SysPost;
import org.ruoyi.system.domain.SysPostToSysPostVoMapper;
import org.ruoyi.system.domain.SysRole;
import org.ruoyi.system.domain.SysRoleToSysRoleVoMapper;
import org.ruoyi.system.domain.SysTenant;
import org.ruoyi.system.domain.SysTenantPackage;
import org.ruoyi.system.domain.SysTenantPackageToSysTenantPackageVoMapper;
import org.ruoyi.system.domain.SysTenantToSysTenantVoMapper;
import org.ruoyi.system.domain.SysUser;
import org.ruoyi.system.domain.SysUserToSysUserVoMapper;
import org.ruoyi.system.domain.bo.ChatConfigBo;
import org.ruoyi.system.domain.bo.ChatConfigBoToChatConfigMapper;
import org.ruoyi.system.domain.bo.SysConfigBo;
import org.ruoyi.system.domain.bo.SysConfigBoToSysConfigMapper;
import org.ruoyi.system.domain.bo.SysDeptBo;
import org.ruoyi.system.domain.bo.SysDeptBoToSysDeptMapper;
import org.ruoyi.system.domain.bo.SysDictDataBo;
import org.ruoyi.system.domain.bo.SysDictDataBoToSysDictDataMapper;
import org.ruoyi.system.domain.bo.SysDictTypeBo;
import org.ruoyi.system.domain.bo.SysDictTypeBoToSysDictTypeMapper;
import org.ruoyi.system.domain.bo.SysLogininforBo;
import org.ruoyi.system.domain.bo.SysLogininforBoToSysLogininforMapper;
import org.ruoyi.system.domain.bo.SysMenuBo;
import org.ruoyi.system.domain.bo.SysMenuBoToSysMenuMapper;
import org.ruoyi.system.domain.bo.SysNoticeBo;
import org.ruoyi.system.domain.bo.SysNoticeBoToSysNoticeMapper;
import org.ruoyi.system.domain.bo.SysNoticeStateBo;
import org.ruoyi.system.domain.bo.SysNoticeStateBoToSysNoticeStateMapper;
import org.ruoyi.system.domain.bo.SysOperLogBo;
import org.ruoyi.system.domain.bo.SysOperLogBoToOperLogEventMapper;
import org.ruoyi.system.domain.bo.SysOperLogBoToSysOperLogMapper;
import org.ruoyi.system.domain.bo.SysOssBo;
import org.ruoyi.system.domain.bo.SysOssBoToSysOssMapper;
import org.ruoyi.system.domain.bo.SysOssConfigBo;
import org.ruoyi.system.domain.bo.SysOssConfigBoToSysOssConfigMapper;
import org.ruoyi.system.domain.bo.SysPostBo;
import org.ruoyi.system.domain.bo.SysPostBoToSysPostMapper;
import org.ruoyi.system.domain.bo.SysRoleBo;
import org.ruoyi.system.domain.bo.SysRoleBoToSysRoleMapper;
import org.ruoyi.system.domain.bo.SysTenantBo;
import org.ruoyi.system.domain.bo.SysTenantBoToSysTenantMapper;
import org.ruoyi.system.domain.bo.SysTenantPackageBo;
import org.ruoyi.system.domain.bo.SysTenantPackageBoToSysTenantPackageMapper;
import org.ruoyi.system.domain.bo.SysUserBo;
import org.ruoyi.system.domain.bo.SysUserBoToSysUserMapper;
import org.ruoyi.system.domain.vo.ChatConfigVo;
import org.ruoyi.system.domain.vo.ChatConfigVoToChatConfigMapper;
import org.ruoyi.system.domain.vo.SysConfigVo;
import org.ruoyi.system.domain.vo.SysConfigVoToSysConfigMapper;
import org.ruoyi.system.domain.vo.SysDeptVo;
import org.ruoyi.system.domain.vo.SysDeptVoToSysDeptMapper;
import org.ruoyi.system.domain.vo.SysDictDataVo;
import org.ruoyi.system.domain.vo.SysDictDataVoToSysDictDataMapper;
import org.ruoyi.system.domain.vo.SysDictTypeVo;
import org.ruoyi.system.domain.vo.SysDictTypeVoToSysDictTypeMapper;
import org.ruoyi.system.domain.vo.SysLogininforVo;
import org.ruoyi.system.domain.vo.SysLogininforVoToSysLogininforMapper;
import org.ruoyi.system.domain.vo.SysMenuVo;
import org.ruoyi.system.domain.vo.SysMenuVoToSysMenuMapper;
import org.ruoyi.system.domain.vo.SysNoticeStateVo;
import org.ruoyi.system.domain.vo.SysNoticeStateVoToSysNoticeStateMapper;
import org.ruoyi.system.domain.vo.SysNoticeVo;
import org.ruoyi.system.domain.vo.SysNoticeVoToSysNoticeMapper;
import org.ruoyi.system.domain.vo.SysOperLogVo;
import org.ruoyi.system.domain.vo.SysOperLogVoToSysOperLogMapper;
import org.ruoyi.system.domain.vo.SysOssConfigVo;
import org.ruoyi.system.domain.vo.SysOssConfigVoToSysOssConfigMapper;
import org.ruoyi.system.domain.vo.SysOssVo;
import org.ruoyi.system.domain.vo.SysOssVoToSysOssMapper;
import org.ruoyi.system.domain.vo.SysPostVo;
import org.ruoyi.system.domain.vo.SysPostVoToSysPostMapper;
import org.ruoyi.system.domain.vo.SysRoleVo;
import org.ruoyi.system.domain.vo.SysRoleVoToSysRoleMapper;
import org.ruoyi.system.domain.vo.SysTenantPackageVo;
import org.ruoyi.system.domain.vo.SysTenantPackageVoToSysTenantPackageMapper;
import org.ruoyi.system.domain.vo.SysTenantVo;
import org.ruoyi.system.domain.vo.SysTenantVoToSysTenantMapper;
import org.ruoyi.system.domain.vo.SysTenantVoToTenantListVoMapper;
import org.ruoyi.system.domain.vo.SysUserExportVo;
import org.ruoyi.system.domain.vo.SysUserVo;
import org.ruoyi.system.domain.vo.SysUserVoToSysUserExportVoMapper;
import org.ruoyi.system.domain.vo.SysUserVoToSysUserMapper;
import org.ruoyi.system.domain.vo.TenantListVo;
import org.ruoyi.system.domain.vo.TenantListVoToSysTenantVoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class ConvertMapperAdapter {
  private ChatConfigToChatConfigVoMapper chatConfigToChatConfigVoMapper;

  private SysDictDataBoToSysDictDataMapper sysDictDataBoToSysDictDataMapper;

  private SysNoticeVoToSysNoticeMapper sysNoticeVoToSysNoticeMapper;

  private SysLogininforVoToSysLogininforMapper sysLogininforVoToSysLogininforMapper;

  private SysRoleToSysRoleVoMapper sysRoleToSysRoleVoMapper;

  private SysTenantPackageToSysTenantPackageVoMapper sysTenantPackageToSysTenantPackageVoMapper;

  private SysNoticeStateBoToSysNoticeStateMapper sysNoticeStateBoToSysNoticeStateMapper;

  private SysDictTypeBoToSysDictTypeMapper sysDictTypeBoToSysDictTypeMapper;

  private SysRoleBoToSysRoleMapper sysRoleBoToSysRoleMapper;

  private SysDeptToSysDeptVoMapper sysDeptToSysDeptVoMapper;

  private SysMenuToSysMenuVoMapper sysMenuToSysMenuVoMapper;

  private SysPostBoToSysPostMapper sysPostBoToSysPostMapper;

  private SysDictTypeVoToSysDictTypeMapper sysDictTypeVoToSysDictTypeMapper;

  private SysTenantPackageBoToSysTenantPackageMapper sysTenantPackageBoToSysTenantPackageMapper;

  private SysMenuVoToSysMenuMapper sysMenuVoToSysMenuMapper;

  private SysNoticeStateVoToSysNoticeStateMapper sysNoticeStateVoToSysNoticeStateMapper;

  private SysTenantBoToSysTenantMapper sysTenantBoToSysTenantMapper;

  private SysOperLogToSysOperLogVoMapper sysOperLogToSysOperLogVoMapper;

  private SysOssToSysOssVoMapper sysOssToSysOssVoMapper;

  private SysDeptVoToSysDeptMapper sysDeptVoToSysDeptMapper;

  private SysTenantVoToSysTenantMapper sysTenantVoToSysTenantMapper;

  private SysDictDataVoToSysDictDataMapper sysDictDataVoToSysDictDataMapper;

  private SysUserVoToSysUserMapper sysUserVoToSysUserMapper;

  private SysPostToSysPostVoMapper sysPostToSysPostVoMapper;

  private SysOssConfigBoToSysOssConfigMapper sysOssConfigBoToSysOssConfigMapper;

  private SysNoticeBoToSysNoticeMapper sysNoticeBoToSysNoticeMapper;

  private SysDeptBoToSysDeptMapper sysDeptBoToSysDeptMapper;

  private SysTenantPackageVoToSysTenantPackageMapper sysTenantPackageVoToSysTenantPackageMapper;

  private OperLogEventToSysOperLogBoMapper operLogEventToSysOperLogBoMapper;

  private SysOperLogBoToSysOperLogMapper sysOperLogBoToSysOperLogMapper;

  private SysUserBoToSysUserMapper sysUserBoToSysUserMapper;

  private SysOssVoToSysOssMapper sysOssVoToSysOssMapper;

  private SysOperLogBoToOperLogEventMapper sysOperLogBoToOperLogEventMapper;

  private SysPostVoToSysPostMapper sysPostVoToSysPostMapper;

  private SysTenantVoToTenantListVoMapper sysTenantVoToTenantListVoMapper;

  private SysOssBoToSysOssMapper sysOssBoToSysOssMapper;

  private SysNoticeToSysNoticeVoMapper sysNoticeToSysNoticeVoMapper;

  private SysOperLogVoToSysOperLogMapper sysOperLogVoToSysOperLogMapper;

  private SysDictDataToSysDictDataVoMapper sysDictDataToSysDictDataVoMapper;

  private SysNoticeStateToSysNoticeStateVoMapper sysNoticeStateToSysNoticeStateVoMapper;

  private SysRoleVoToSysRoleMapper sysRoleVoToSysRoleMapper;

  private SysMenuBoToSysMenuMapper sysMenuBoToSysMenuMapper;

  private ChatConfigVoToChatConfigMapper chatConfigVoToChatConfigMapper;

  private SysConfigVoToSysConfigMapper sysConfigVoToSysConfigMapper;

  private SysConfigBoToSysConfigMapper sysConfigBoToSysConfigMapper;

  private SysUserToSysUserVoMapper sysUserToSysUserVoMapper;

  private SysLogininforToSysLogininforVoMapper sysLogininforToSysLogininforVoMapper;

  private TenantListVoToSysTenantVoMapper tenantListVoToSysTenantVoMapper;

  private ChatConfigBoToChatConfigMapper chatConfigBoToChatConfigMapper;

  private SysDictTypeToSysDictTypeVoMapper sysDictTypeToSysDictTypeVoMapper;

  private SysTenantToSysTenantVoMapper sysTenantToSysTenantVoMapper;

  private SysConfigToSysConfigVoMapper sysConfigToSysConfigVoMapper;

  private SysOssConfigVoToSysOssConfigMapper sysOssConfigVoToSysOssConfigMapper;

  private SysLogininforBoToSysLogininforMapper sysLogininforBoToSysLogininforMapper;

  private SysUserVoToSysUserExportVoMapper sysUserVoToSysUserExportVoMapper;

  private SysOssConfigToSysOssConfigVoMapper sysOssConfigToSysOssConfigVoMapper;

  @Autowired
  public void setChatConfigToChatConfigVoMapper(@Lazy ChatConfigToChatConfigVoMapper chatConfigToChatConfigVoMapper) {
    this.chatConfigToChatConfigVoMapper = chatConfigToChatConfigVoMapper;
  }

  @Autowired
  public void setSysDictDataBoToSysDictDataMapper(@Lazy SysDictDataBoToSysDictDataMapper sysDictDataBoToSysDictDataMapper) {
    this.sysDictDataBoToSysDictDataMapper = sysDictDataBoToSysDictDataMapper;
  }

  @Autowired
  public void setSysNoticeVoToSysNoticeMapper(@Lazy SysNoticeVoToSysNoticeMapper sysNoticeVoToSysNoticeMapper) {
    this.sysNoticeVoToSysNoticeMapper = sysNoticeVoToSysNoticeMapper;
  }

  @Autowired
  public void setSysLogininforVoToSysLogininforMapper(@Lazy SysLogininforVoToSysLogininforMapper sysLogininforVoToSysLogininforMapper) {
    this.sysLogininforVoToSysLogininforMapper = sysLogininforVoToSysLogininforMapper;
  }

  @Autowired
  public void setSysRoleToSysRoleVoMapper(@Lazy SysRoleToSysRoleVoMapper sysRoleToSysRoleVoMapper) {
    this.sysRoleToSysRoleVoMapper = sysRoleToSysRoleVoMapper;
  }

  @Autowired
  public void setSysTenantPackageToSysTenantPackageVoMapper(@Lazy SysTenantPackageToSysTenantPackageVoMapper sysTenantPackageToSysTenantPackageVoMapper) {
    this.sysTenantPackageToSysTenantPackageVoMapper = sysTenantPackageToSysTenantPackageVoMapper;
  }

  @Autowired
  public void setSysNoticeStateBoToSysNoticeStateMapper(@Lazy SysNoticeStateBoToSysNoticeStateMapper sysNoticeStateBoToSysNoticeStateMapper) {
    this.sysNoticeStateBoToSysNoticeStateMapper = sysNoticeStateBoToSysNoticeStateMapper;
  }

  @Autowired
  public void setSysDictTypeBoToSysDictTypeMapper(@Lazy SysDictTypeBoToSysDictTypeMapper sysDictTypeBoToSysDictTypeMapper) {
    this.sysDictTypeBoToSysDictTypeMapper = sysDictTypeBoToSysDictTypeMapper;
  }

  @Autowired
  public void setSysRoleBoToSysRoleMapper(@Lazy SysRoleBoToSysRoleMapper sysRoleBoToSysRoleMapper) {
    this.sysRoleBoToSysRoleMapper = sysRoleBoToSysRoleMapper;
  }

  @Autowired
  public void setSysDeptToSysDeptVoMapper(@Lazy SysDeptToSysDeptVoMapper sysDeptToSysDeptVoMapper) {
    this.sysDeptToSysDeptVoMapper = sysDeptToSysDeptVoMapper;
  }

  @Autowired
  public void setSysMenuToSysMenuVoMapper(@Lazy SysMenuToSysMenuVoMapper sysMenuToSysMenuVoMapper) {
    this.sysMenuToSysMenuVoMapper = sysMenuToSysMenuVoMapper;
  }

  @Autowired
  public void setSysPostBoToSysPostMapper(@Lazy SysPostBoToSysPostMapper sysPostBoToSysPostMapper) {
    this.sysPostBoToSysPostMapper = sysPostBoToSysPostMapper;
  }

  @Autowired
  public void setSysDictTypeVoToSysDictTypeMapper(@Lazy SysDictTypeVoToSysDictTypeMapper sysDictTypeVoToSysDictTypeMapper) {
    this.sysDictTypeVoToSysDictTypeMapper = sysDictTypeVoToSysDictTypeMapper;
  }

  @Autowired
  public void setSysTenantPackageBoToSysTenantPackageMapper(@Lazy SysTenantPackageBoToSysTenantPackageMapper sysTenantPackageBoToSysTenantPackageMapper) {
    this.sysTenantPackageBoToSysTenantPackageMapper = sysTenantPackageBoToSysTenantPackageMapper;
  }

  @Autowired
  public void setSysMenuVoToSysMenuMapper(@Lazy SysMenuVoToSysMenuMapper sysMenuVoToSysMenuMapper) {
    this.sysMenuVoToSysMenuMapper = sysMenuVoToSysMenuMapper;
  }

  @Autowired
  public void setSysNoticeStateVoToSysNoticeStateMapper(@Lazy SysNoticeStateVoToSysNoticeStateMapper sysNoticeStateVoToSysNoticeStateMapper) {
    this.sysNoticeStateVoToSysNoticeStateMapper = sysNoticeStateVoToSysNoticeStateMapper;
  }

  @Autowired
  public void setSysTenantBoToSysTenantMapper(@Lazy SysTenantBoToSysTenantMapper sysTenantBoToSysTenantMapper) {
    this.sysTenantBoToSysTenantMapper = sysTenantBoToSysTenantMapper;
  }

  @Autowired
  public void setSysOperLogToSysOperLogVoMapper(@Lazy SysOperLogToSysOperLogVoMapper sysOperLogToSysOperLogVoMapper) {
    this.sysOperLogToSysOperLogVoMapper = sysOperLogToSysOperLogVoMapper;
  }

  @Autowired
  public void setSysOssToSysOssVoMapper(@Lazy SysOssToSysOssVoMapper sysOssToSysOssVoMapper) {
    this.sysOssToSysOssVoMapper = sysOssToSysOssVoMapper;
  }

  @Autowired
  public void setSysDeptVoToSysDeptMapper(@Lazy SysDeptVoToSysDeptMapper sysDeptVoToSysDeptMapper) {
    this.sysDeptVoToSysDeptMapper = sysDeptVoToSysDeptMapper;
  }

  @Autowired
  public void setSysTenantVoToSysTenantMapper(@Lazy SysTenantVoToSysTenantMapper sysTenantVoToSysTenantMapper) {
    this.sysTenantVoToSysTenantMapper = sysTenantVoToSysTenantMapper;
  }

  @Autowired
  public void setSysDictDataVoToSysDictDataMapper(@Lazy SysDictDataVoToSysDictDataMapper sysDictDataVoToSysDictDataMapper) {
    this.sysDictDataVoToSysDictDataMapper = sysDictDataVoToSysDictDataMapper;
  }

  @Autowired
  public void setSysUserVoToSysUserMapper(@Lazy SysUserVoToSysUserMapper sysUserVoToSysUserMapper) {
    this.sysUserVoToSysUserMapper = sysUserVoToSysUserMapper;
  }

  @Autowired
  public void setSysPostToSysPostVoMapper(@Lazy SysPostToSysPostVoMapper sysPostToSysPostVoMapper) {
    this.sysPostToSysPostVoMapper = sysPostToSysPostVoMapper;
  }

  @Autowired
  public void setSysOssConfigBoToSysOssConfigMapper(@Lazy SysOssConfigBoToSysOssConfigMapper sysOssConfigBoToSysOssConfigMapper) {
    this.sysOssConfigBoToSysOssConfigMapper = sysOssConfigBoToSysOssConfigMapper;
  }

  @Autowired
  public void setSysNoticeBoToSysNoticeMapper(@Lazy SysNoticeBoToSysNoticeMapper sysNoticeBoToSysNoticeMapper) {
    this.sysNoticeBoToSysNoticeMapper = sysNoticeBoToSysNoticeMapper;
  }

  @Autowired
  public void setSysDeptBoToSysDeptMapper(@Lazy SysDeptBoToSysDeptMapper sysDeptBoToSysDeptMapper) {
    this.sysDeptBoToSysDeptMapper = sysDeptBoToSysDeptMapper;
  }

  @Autowired
  public void setSysTenantPackageVoToSysTenantPackageMapper(@Lazy SysTenantPackageVoToSysTenantPackageMapper sysTenantPackageVoToSysTenantPackageMapper) {
    this.sysTenantPackageVoToSysTenantPackageMapper = sysTenantPackageVoToSysTenantPackageMapper;
  }

  @Autowired
  public void setOperLogEventToSysOperLogBoMapper(@Lazy OperLogEventToSysOperLogBoMapper operLogEventToSysOperLogBoMapper) {
    this.operLogEventToSysOperLogBoMapper = operLogEventToSysOperLogBoMapper;
  }

  @Autowired
  public void setSysOperLogBoToSysOperLogMapper(@Lazy SysOperLogBoToSysOperLogMapper sysOperLogBoToSysOperLogMapper) {
    this.sysOperLogBoToSysOperLogMapper = sysOperLogBoToSysOperLogMapper;
  }

  @Autowired
  public void setSysUserBoToSysUserMapper(@Lazy SysUserBoToSysUserMapper sysUserBoToSysUserMapper) {
    this.sysUserBoToSysUserMapper = sysUserBoToSysUserMapper;
  }

  @Autowired
  public void setSysOssVoToSysOssMapper(@Lazy SysOssVoToSysOssMapper sysOssVoToSysOssMapper) {
    this.sysOssVoToSysOssMapper = sysOssVoToSysOssMapper;
  }

  @Autowired
  public void setSysOperLogBoToOperLogEventMapper(@Lazy SysOperLogBoToOperLogEventMapper sysOperLogBoToOperLogEventMapper) {
    this.sysOperLogBoToOperLogEventMapper = sysOperLogBoToOperLogEventMapper;
  }

  @Autowired
  public void setSysPostVoToSysPostMapper(@Lazy SysPostVoToSysPostMapper sysPostVoToSysPostMapper) {
    this.sysPostVoToSysPostMapper = sysPostVoToSysPostMapper;
  }

  @Autowired
  public void setSysTenantVoToTenantListVoMapper(@Lazy SysTenantVoToTenantListVoMapper sysTenantVoToTenantListVoMapper) {
    this.sysTenantVoToTenantListVoMapper = sysTenantVoToTenantListVoMapper;
  }

  @Autowired
  public void setSysOssBoToSysOssMapper(@Lazy SysOssBoToSysOssMapper sysOssBoToSysOssMapper) {
    this.sysOssBoToSysOssMapper = sysOssBoToSysOssMapper;
  }

  @Autowired
  public void setSysNoticeToSysNoticeVoMapper(@Lazy SysNoticeToSysNoticeVoMapper sysNoticeToSysNoticeVoMapper) {
    this.sysNoticeToSysNoticeVoMapper = sysNoticeToSysNoticeVoMapper;
  }

  @Autowired
  public void setSysOperLogVoToSysOperLogMapper(@Lazy SysOperLogVoToSysOperLogMapper sysOperLogVoToSysOperLogMapper) {
    this.sysOperLogVoToSysOperLogMapper = sysOperLogVoToSysOperLogMapper;
  }

  @Autowired
  public void setSysDictDataToSysDictDataVoMapper(@Lazy SysDictDataToSysDictDataVoMapper sysDictDataToSysDictDataVoMapper) {
    this.sysDictDataToSysDictDataVoMapper = sysDictDataToSysDictDataVoMapper;
  }

  @Autowired
  public void setSysNoticeStateToSysNoticeStateVoMapper(@Lazy SysNoticeStateToSysNoticeStateVoMapper sysNoticeStateToSysNoticeStateVoMapper) {
    this.sysNoticeStateToSysNoticeStateVoMapper = sysNoticeStateToSysNoticeStateVoMapper;
  }

  @Autowired
  public void setSysRoleVoToSysRoleMapper(@Lazy SysRoleVoToSysRoleMapper sysRoleVoToSysRoleMapper) {
    this.sysRoleVoToSysRoleMapper = sysRoleVoToSysRoleMapper;
  }

  @Autowired
  public void setSysMenuBoToSysMenuMapper(@Lazy SysMenuBoToSysMenuMapper sysMenuBoToSysMenuMapper) {
    this.sysMenuBoToSysMenuMapper = sysMenuBoToSysMenuMapper;
  }

  @Autowired
  public void setChatConfigVoToChatConfigMapper(@Lazy ChatConfigVoToChatConfigMapper chatConfigVoToChatConfigMapper) {
    this.chatConfigVoToChatConfigMapper = chatConfigVoToChatConfigMapper;
  }

  @Autowired
  public void setSysConfigVoToSysConfigMapper(@Lazy SysConfigVoToSysConfigMapper sysConfigVoToSysConfigMapper) {
    this.sysConfigVoToSysConfigMapper = sysConfigVoToSysConfigMapper;
  }

  @Autowired
  public void setSysConfigBoToSysConfigMapper(@Lazy SysConfigBoToSysConfigMapper sysConfigBoToSysConfigMapper) {
    this.sysConfigBoToSysConfigMapper = sysConfigBoToSysConfigMapper;
  }

  @Autowired
  public void setSysUserToSysUserVoMapper(@Lazy SysUserToSysUserVoMapper sysUserToSysUserVoMapper) {
    this.sysUserToSysUserVoMapper = sysUserToSysUserVoMapper;
  }

  @Autowired
  public void setSysLogininforToSysLogininforVoMapper(@Lazy SysLogininforToSysLogininforVoMapper sysLogininforToSysLogininforVoMapper) {
    this.sysLogininforToSysLogininforVoMapper = sysLogininforToSysLogininforVoMapper;
  }

  @Autowired
  public void setTenantListVoToSysTenantVoMapper(@Lazy TenantListVoToSysTenantVoMapper tenantListVoToSysTenantVoMapper) {
    this.tenantListVoToSysTenantVoMapper = tenantListVoToSysTenantVoMapper;
  }

  @Autowired
  public void setChatConfigBoToChatConfigMapper(@Lazy ChatConfigBoToChatConfigMapper chatConfigBoToChatConfigMapper) {
    this.chatConfigBoToChatConfigMapper = chatConfigBoToChatConfigMapper;
  }

  @Autowired
  public void setSysDictTypeToSysDictTypeVoMapper(@Lazy SysDictTypeToSysDictTypeVoMapper sysDictTypeToSysDictTypeVoMapper) {
    this.sysDictTypeToSysDictTypeVoMapper = sysDictTypeToSysDictTypeVoMapper;
  }

  @Autowired
  public void setSysTenantToSysTenantVoMapper(@Lazy SysTenantToSysTenantVoMapper sysTenantToSysTenantVoMapper) {
    this.sysTenantToSysTenantVoMapper = sysTenantToSysTenantVoMapper;
  }

  @Autowired
  public void setSysConfigToSysConfigVoMapper(@Lazy SysConfigToSysConfigVoMapper sysConfigToSysConfigVoMapper) {
    this.sysConfigToSysConfigVoMapper = sysConfigToSysConfigVoMapper;
  }

  @Autowired
  public void setSysOssConfigVoToSysOssConfigMapper(@Lazy SysOssConfigVoToSysOssConfigMapper sysOssConfigVoToSysOssConfigMapper) {
    this.sysOssConfigVoToSysOssConfigMapper = sysOssConfigVoToSysOssConfigMapper;
  }

  @Autowired
  public void setSysLogininforBoToSysLogininforMapper(@Lazy SysLogininforBoToSysLogininforMapper sysLogininforBoToSysLogininforMapper) {
    this.sysLogininforBoToSysLogininforMapper = sysLogininforBoToSysLogininforMapper;
  }

  @Autowired
  public void setSysUserVoToSysUserExportVoMapper(@Lazy SysUserVoToSysUserExportVoMapper sysUserVoToSysUserExportVoMapper) {
    this.sysUserVoToSysUserExportVoMapper = sysUserVoToSysUserExportVoMapper;
  }

  @Autowired
  public void setSysOssConfigToSysOssConfigVoMapper(@Lazy SysOssConfigToSysOssConfigVoMapper sysOssConfigToSysOssConfigVoMapper) {
    this.sysOssConfigToSysOssConfigVoMapper = sysOssConfigToSysOssConfigVoMapper;
  }

  public ChatConfigVo chatConfigToChatConfigVo(ChatConfig chatConfig) {
    return chatConfigToChatConfigVoMapper.convert(chatConfig);
  }

  public SysDictData sysDictDataBoToSysDictData(SysDictDataBo sysDictDataBo) {
    return sysDictDataBoToSysDictDataMapper.convert(sysDictDataBo);
  }

  public SysNotice sysNoticeVoToSysNotice(SysNoticeVo sysNoticeVo) {
    return sysNoticeVoToSysNoticeMapper.convert(sysNoticeVo);
  }

  public SysLogininfor sysLogininforVoToSysLogininfor(SysLogininforVo sysLogininforVo) {
    return sysLogininforVoToSysLogininforMapper.convert(sysLogininforVo);
  }

  public SysRoleVo sysRoleToSysRoleVo(SysRole sysRole) {
    return sysRoleToSysRoleVoMapper.convert(sysRole);
  }

  public SysTenantPackageVo sysTenantPackageToSysTenantPackageVo(SysTenantPackage sysTenantPackage) {
    return sysTenantPackageToSysTenantPackageVoMapper.convert(sysTenantPackage);
  }

  public SysNoticeState sysNoticeStateBoToSysNoticeState(SysNoticeStateBo sysNoticeStateBo) {
    return sysNoticeStateBoToSysNoticeStateMapper.convert(sysNoticeStateBo);
  }

  public SysDictType sysDictTypeBoToSysDictType(SysDictTypeBo sysDictTypeBo) {
    return sysDictTypeBoToSysDictTypeMapper.convert(sysDictTypeBo);
  }

  public SysRole sysRoleBoToSysRole(SysRoleBo sysRoleBo) {
    return sysRoleBoToSysRoleMapper.convert(sysRoleBo);
  }

  public SysDeptVo sysDeptToSysDeptVo(SysDept sysDept) {
    return sysDeptToSysDeptVoMapper.convert(sysDept);
  }

  public SysMenuVo sysMenuToSysMenuVo(SysMenu sysMenu) {
    return sysMenuToSysMenuVoMapper.convert(sysMenu);
  }

  public SysPost sysPostBoToSysPost(SysPostBo sysPostBo) {
    return sysPostBoToSysPostMapper.convert(sysPostBo);
  }

  public SysDictType sysDictTypeVoToSysDictType(SysDictTypeVo sysDictTypeVo) {
    return sysDictTypeVoToSysDictTypeMapper.convert(sysDictTypeVo);
  }

  public SysTenantPackage sysTenantPackageBoToSysTenantPackage(SysTenantPackageBo sysTenantPackageBo) {
    return sysTenantPackageBoToSysTenantPackageMapper.convert(sysTenantPackageBo);
  }

  public SysMenu sysMenuVoToSysMenu(SysMenuVo sysMenuVo) {
    return sysMenuVoToSysMenuMapper.convert(sysMenuVo);
  }

  public SysNoticeState sysNoticeStateVoToSysNoticeState(SysNoticeStateVo sysNoticeStateVo) {
    return sysNoticeStateVoToSysNoticeStateMapper.convert(sysNoticeStateVo);
  }

  public SysTenant sysTenantBoToSysTenant(SysTenantBo sysTenantBo) {
    return sysTenantBoToSysTenantMapper.convert(sysTenantBo);
  }

  public SysOperLogVo sysOperLogToSysOperLogVo(SysOperLog sysOperLog) {
    return sysOperLogToSysOperLogVoMapper.convert(sysOperLog);
  }

  public SysOssVo sysOssToSysOssVo(SysOss sysOss) {
    return sysOssToSysOssVoMapper.convert(sysOss);
  }

  public SysDept sysDeptVoToSysDept(SysDeptVo sysDeptVo) {
    return sysDeptVoToSysDeptMapper.convert(sysDeptVo);
  }

  public SysTenant sysTenantVoToSysTenant(SysTenantVo sysTenantVo) {
    return sysTenantVoToSysTenantMapper.convert(sysTenantVo);
  }

  public SysDictData sysDictDataVoToSysDictData(SysDictDataVo sysDictDataVo) {
    return sysDictDataVoToSysDictDataMapper.convert(sysDictDataVo);
  }

  public SysUser sysUserVoToSysUser(SysUserVo sysUserVo) {
    return sysUserVoToSysUserMapper.convert(sysUserVo);
  }

  public SysPostVo sysPostToSysPostVo(SysPost sysPost) {
    return sysPostToSysPostVoMapper.convert(sysPost);
  }

  public SysOssConfig sysOssConfigBoToSysOssConfig(SysOssConfigBo sysOssConfigBo) {
    return sysOssConfigBoToSysOssConfigMapper.convert(sysOssConfigBo);
  }

  public SysNotice sysNoticeBoToSysNotice(SysNoticeBo sysNoticeBo) {
    return sysNoticeBoToSysNoticeMapper.convert(sysNoticeBo);
  }

  public SysDept sysDeptBoToSysDept(SysDeptBo sysDeptBo) {
    return sysDeptBoToSysDeptMapper.convert(sysDeptBo);
  }

  public SysTenantPackage sysTenantPackageVoToSysTenantPackage(SysTenantPackageVo sysTenantPackageVo) {
    return sysTenantPackageVoToSysTenantPackageMapper.convert(sysTenantPackageVo);
  }

  public SysOperLogBo operLogEventToSysOperLogBo(OperLogEvent operLogEvent) {
    return operLogEventToSysOperLogBoMapper.convert(operLogEvent);
  }

  public SysOperLog sysOperLogBoToSysOperLog(SysOperLogBo sysOperLogBo) {
    return sysOperLogBoToSysOperLogMapper.convert(sysOperLogBo);
  }

  public SysUser sysUserBoToSysUser(SysUserBo sysUserBo) {
    return sysUserBoToSysUserMapper.convert(sysUserBo);
  }

  public SysOss sysOssVoToSysOss(SysOssVo sysOssVo) {
    return sysOssVoToSysOssMapper.convert(sysOssVo);
  }

  public OperLogEvent sysOperLogBoToOperLogEvent(SysOperLogBo sysOperLogBo) {
    return sysOperLogBoToOperLogEventMapper.convert(sysOperLogBo);
  }

  public SysPost sysPostVoToSysPost(SysPostVo sysPostVo) {
    return sysPostVoToSysPostMapper.convert(sysPostVo);
  }

  public TenantListVo sysTenantVoToTenantListVo(SysTenantVo sysTenantVo) {
    return sysTenantVoToTenantListVoMapper.convert(sysTenantVo);
  }

  public SysOss sysOssBoToSysOss(SysOssBo sysOssBo) {
    return sysOssBoToSysOssMapper.convert(sysOssBo);
  }

  public SysNoticeVo sysNoticeToSysNoticeVo(SysNotice sysNotice) {
    return sysNoticeToSysNoticeVoMapper.convert(sysNotice);
  }

  public SysOperLog sysOperLogVoToSysOperLog(SysOperLogVo sysOperLogVo) {
    return sysOperLogVoToSysOperLogMapper.convert(sysOperLogVo);
  }

  public SysDictDataVo sysDictDataToSysDictDataVo(SysDictData sysDictData) {
    return sysDictDataToSysDictDataVoMapper.convert(sysDictData);
  }

  public SysNoticeStateVo sysNoticeStateToSysNoticeStateVo(SysNoticeState sysNoticeState) {
    return sysNoticeStateToSysNoticeStateVoMapper.convert(sysNoticeState);
  }

  public SysRole sysRoleVoToSysRole(SysRoleVo sysRoleVo) {
    return sysRoleVoToSysRoleMapper.convert(sysRoleVo);
  }

  public SysMenu sysMenuBoToSysMenu(SysMenuBo sysMenuBo) {
    return sysMenuBoToSysMenuMapper.convert(sysMenuBo);
  }

  public ChatConfig chatConfigVoToChatConfig(ChatConfigVo chatConfigVo) {
    return chatConfigVoToChatConfigMapper.convert(chatConfigVo);
  }

  public SysConfig sysConfigVoToSysConfig(SysConfigVo sysConfigVo) {
    return sysConfigVoToSysConfigMapper.convert(sysConfigVo);
  }

  public SysConfig sysConfigBoToSysConfig(SysConfigBo sysConfigBo) {
    return sysConfigBoToSysConfigMapper.convert(sysConfigBo);
  }

  public SysUserVo sysUserToSysUserVo(SysUser sysUser) {
    return sysUserToSysUserVoMapper.convert(sysUser);
  }

  public SysLogininforVo sysLogininforToSysLogininforVo(SysLogininfor sysLogininfor) {
    return sysLogininforToSysLogininforVoMapper.convert(sysLogininfor);
  }

  public SysTenantVo tenantListVoToSysTenantVo(TenantListVo tenantListVo) {
    return tenantListVoToSysTenantVoMapper.convert(tenantListVo);
  }

  public ChatConfig chatConfigBoToChatConfig(ChatConfigBo chatConfigBo) {
    return chatConfigBoToChatConfigMapper.convert(chatConfigBo);
  }

  public SysDictTypeVo sysDictTypeToSysDictTypeVo(SysDictType sysDictType) {
    return sysDictTypeToSysDictTypeVoMapper.convert(sysDictType);
  }

  public SysTenantVo sysTenantToSysTenantVo(SysTenant sysTenant) {
    return sysTenantToSysTenantVoMapper.convert(sysTenant);
  }

  public SysConfigVo sysConfigToSysConfigVo(SysConfig sysConfig) {
    return sysConfigToSysConfigVoMapper.convert(sysConfig);
  }

  public SysOssConfig sysOssConfigVoToSysOssConfig(SysOssConfigVo sysOssConfigVo) {
    return sysOssConfigVoToSysOssConfigMapper.convert(sysOssConfigVo);
  }

  public SysLogininfor sysLogininforBoToSysLogininfor(SysLogininforBo sysLogininforBo) {
    return sysLogininforBoToSysLogininforMapper.convert(sysLogininforBo);
  }

  public SysUserExportVo sysUserVoToSysUserExportVo(SysUserVo sysUserVo) {
    return sysUserVoToSysUserExportVoMapper.convert(sysUserVo);
  }

  public SysOssConfigVo sysOssConfigToSysOssConfigVo(SysOssConfig sysOssConfig) {
    return sysOssConfigToSysOssConfigVoMapper.convert(sysOssConfig);
  }
}
