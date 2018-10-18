package com.wdsite.shiro.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wdsite.shiro.entity.SysRole;
import com.wdsite.shiro.entity.SysUser;
import com.wdsite.shiro.entity.SysUserRole;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Dy
 * @since 2018-10-12
 */
public interface SysUserRoleMapper extends BaseMapper<SysUserRole> {
	
	public List<SysUser> getUsersByRoleId(Long roleId);
	
	public List<SysRole> getRolesByUserId(Long userId);

}
