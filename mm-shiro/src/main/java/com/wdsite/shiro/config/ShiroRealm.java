package com.wdsite.shiro.config;

import org.apache.shiro.authc.AccountException;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.wdsite.shiro.entity.SysUser;
import com.wdsite.shiro.service.ISysUserService;
import com.wdsite.shiro.util.AuthSubjectUtil;

/**
 * 自定义权限匹配和账号密码匹配
 */
public class ShiroRealm extends AuthorizingRealm {

	private Logger logger = LoggerFactory.getLogger(ShiroRealm.class);

	@Autowired
	private ISysUserService userService;

	/* 主要是用来进行身份认证的，也就是说验证用户输入的账号和密码是否正确。 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		logger.info("Shiro身份-->ShiroRealm.doGetAuthenticationInfo()--------");
		// logger.info("验证当前Subject时获取到token为：\n"
		// + ReflectionToStringBuilder.toString(token, ToStringStyle.MULTI_LINE_STYLE));
		// 获取用户的输入的账号.
		String account = (String) token.getPrincipal();
		// 通过username从数据库中查找 User对象，如果找到，没找到.
		// 实际项目中，这里可以根据实际情况做缓存，如果不做，Shiro自己也是有时间间隔机制，2分钟内不会重复执行该方法
		SysUser user = userService.findByAccount(account);
		if (user == null) {
			throw new AccountException("用户名不正确");
		}
		if (!user.getAvailable()) { // 账户冻结
			throw new LockedAccountException();
		}
		SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(user.getAccount(),
				user.getPassword(), user.getName());
		authenticationInfo.setCredentialsSalt(ByteSource.Util.bytes(user.getAccount() + user.getSalt()));
		return authenticationInfo;
	}

	/* 授权用户信息 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		logger.info("Shiro权限配置-->MyShiroRealm.doGetAuthorizationInfo()");
		// SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
		SysUser user = (SysUser) principals.getPrimaryPrincipal();
		// 到数据库查是否有此对象
		if (user != null) {
			SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
			if (AuthSubjectUtil.isPatformAdmin()) {
				info.addStringPermission("*");
			}
			// 权限信息对象info,用来存放查出的用户的所有的角色（role）及权限（permission）
			info.addRoles(userService.findRoles(user.getAccount()));
			info.addStringPermissions(userService.findPermissions(user.getAccount()));
			return info;
		}
		// 返回null的话，就会导致任何用户访问被拦截的请求时，都会自动跳转到unauthorizedUrl指定的地址
		return null;
	}

}
