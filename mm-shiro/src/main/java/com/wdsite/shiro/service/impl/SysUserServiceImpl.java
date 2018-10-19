package com.wdsite.shiro.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wdsite.shiro.entity.SysUser;
import com.wdsite.shiro.helper.PasswordHelper;
import com.wdsite.shiro.mapper.SysUserMapper;
import com.wdsite.shiro.service.ISysUserService;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Dy
 * @since 2018-10-12
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

	private PasswordHelper passwordHelper = new PasswordHelper();
	
	@Autowired
	private SysUserMapper userDao;
	
	@Override
	public boolean saveOrUpdate(SysUser entity) {
		passwordHelper.encryptPassword(entity);
		return super.saveOrUpdate(entity);
	}
	
	@Override
	public void changePassword(Long userId, String newPassword) {
		SysUser user = getById(userId);
		user.setPassword(newPassword);
		passwordHelper.encryptPassword(user);
		updateById(user);
	}

	@Override
	public void correlaionRoles(Long userId, Integer... roleIds) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void uncorrelationRoles(Long userId, Integer... roleIds) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SysUser findByAccount(String account) {
		SysUser entity = new SysUser();
		entity.setAccount(account);
		QueryWrapper<SysUser> qw = new QueryWrapper<SysUser>();
		qw.setEntity(entity);
		return getOne(qw);
	}

	@Override
	public Set<String> findRoles(String account) {
		SysUser user = this.findByAccount(account);
		if(user == null) {
			return null;
		}
		return userDao.getRolesByUserId(user.getId());
	}

	@Override
	public Set<String> findPermissions(String account) {
		SysUser user = this.findByAccount(account);
		if(user == null) {
			return null;
		}
		return userDao.getPermissionsByUserId(user.getId());
	}

}
