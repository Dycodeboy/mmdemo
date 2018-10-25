package com.wdsite.demo.test;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.SimpleAccountRealm;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.mgt.SecurityManager;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.wdsite.demo.model.Application;
import com.wdsite.shiro.entity.SysUser;
import com.wdsite.shiro.service.ISysUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class ShiroTest {

	private SimpleAccountRealm simpleAccountRealm = new SimpleAccountRealm(); // 创建一个简单的账户域
	
	@Autowired
	private SecurityManager securityManager;

	@Before
	public void Adduser() {
		// 添加一个用户 密码123456 权限 admin
		simpleAccountRealm.addAccount("name", "123456", "admin");
	}

	@Test
	public void test() {

		// 构建SecurityManager环境
		DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();// 创建一个默认的安全管理器
		defaultSecurityManager.setRealm(simpleAccountRealm); // 将账户域添加到安全管理器中

		// 2.主体提交认证请求
		SecurityUtils.setSecurityManager(defaultSecurityManager);// 安全管理器提交到安全工具类中
		Subject subject = SecurityUtils.getSubject();

		UsernamePasswordToken token = new UsernamePasswordToken("name", "123456");
		subject.login(token); // 通过login方法和token进行认证

		subject.isAuthenticated(); // 是否认证成功的方法
		System.out.println(subject.isAuthenticated()); // 认证成功 输出 true
	}

	@Autowired
	private ISysUserService userService;

//	@Autowired
//	private ISysUserRoleService userRoleService;
//
//	@Autowired
//	private ISysRoleService roleService;

	@Test
	public void test2() {
		
		String account = "test1";
		String password = "test1";
		SysUser user = userService.findByAccount(account);
		SecurityUtils.setSecurityManager(securityManager);
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(account, password);
		try {
			subject.login(token);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(subject.isAuthenticated());
		System.out.println(user);
	}
	
	@Test
	public void test3() {
		
		SysUser entity = new SysUser();
		entity.setAccount("test1");
		entity.setPassword("test1");
		entity.setName("test1");
		userService.saveOrUpdate(entity);
		System.out.println(entity);
		
	}

}
