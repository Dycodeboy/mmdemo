package com.wdsite.demo.shiro.service;

import java.util.Set;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wdsite.demo.shiro.entity.SysUser;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Dy
 * @since 2018-10-12
 */
public interface ISysUserService extends IService<SysUser> {
	
	public void changePassword(Long userId, String newPassword); //修改密码
	
	public void correlaionRoles(Long userId, Integer... roleIds); //添加用户-角色关系
	
	public void uncorrelationRoles(Long userId, Integer... roleIds); //移除用户-角色关系
	
	public SysUser findByAccount(String account); //根据账户名查找用户
	
	public Set<String> findRoles(String account); //根据账户名查找其角色
	
	public Set<String> findPermissions(String account); //根据账户名查找其权限

}
