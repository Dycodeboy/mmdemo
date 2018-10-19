package com.wdsite.shiro.mapper;

import java.util.Set;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wdsite.shiro.entity.SysUser;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Dy
 * @since 2018-10-12
 */
public interface SysUserMapper extends BaseMapper<SysUser> {
	
	public Set<String> getRolesByUserId(Long userId);
	
	public Set<String> getPermissionsByUserId(Long userId);
	
}
