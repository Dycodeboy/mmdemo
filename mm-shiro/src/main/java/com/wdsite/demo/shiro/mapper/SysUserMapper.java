package com.wdsite.demo.shiro.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wdsite.demo.shiro.entity.SysUser;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Dy
 * @since 2018-10-12
 */
public interface SysUserMapper extends BaseMapper<SysUser> {
	
	public void saveUserRole(SysUser entity);
	
}
