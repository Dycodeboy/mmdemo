package com.wdsite.common.constant;

/**
 * 
 */
public interface AuthConstant {
    /**
     * 加密算法名
     */
    public static final String hashAlgorithmName = "MD5";

    /**
     * hash次数（两次-再hash）
     */
    public static final int hashIterations = 2;

    /**
     * hex解密支持 （false默认就是base64)
     */
    public static final boolean hexEncodedEnabled = true;

    /**
     * salt 撒盐加密
     */
    public static final String salt = "Vivian666!";
    
	public static class RoleType {
		/** 超级管理员  */
		public static final String SYS_ASMIN_ROLE = "sysadmin";
		/** 管理员  */
		public static final String ADMIN = "admin";
		/** 普通用户 */
		public static final String USER = "user";
	}
	
	/** 
	 * 菜单类型，1：菜单 2：按钮操作 
	 */
	public static final int TYPE_MENU = 1;

	/** 
	 * 菜单类型，1：菜单 2：按钮操作 
	 */
	public static final int TYPE_BUTTON = 2;
	
	/**
     * 用户注册默认角色
     */
    public static final int DEFAULT_REGISTER_ROLE = 5;

    //验证码过期时间
    public static final Long PASS_TIME =  50000 * 60 *1000L;

}
