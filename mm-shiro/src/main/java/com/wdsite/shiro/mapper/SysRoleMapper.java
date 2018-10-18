package com.wdsite.shiro.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wdsite.shiro.entity.SysRole;
import com.wdsite.shiro.entity.SysUser;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Dy
 * @since 2018-10-12
 */
public interface SysRoleMapper extends BaseMapper<SysRole> {
	
	public List<SysRole> getRolesByUserId(Long userId);
	
	public List<SysUser> getUsersByRoleId(Integer roleId);

}
