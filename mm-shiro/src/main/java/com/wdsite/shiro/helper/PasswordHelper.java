package com.wdsite.shiro.helper;

import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

import com.wdsite.shiro.entity.SysUser;

public class PasswordHelper {
	
	private RandomNumberGenerator rng = new SecureRandomNumberGenerator();
	
	private String algorithmName = "md5";
	
	private final int hashIterations = 2;
	
	public void encryptPassword(SysUser user) {
		user.setSalt(rng.nextBytes().toHex());
		String newPassword = new SimpleHash(
				algorithmName,
				user.getPassword(),
				ByteSource.Util.bytes(user.getAccount()+user.getSalt()),
				hashIterations).toHex();
		user.setPassword(newPassword);
	}

}
