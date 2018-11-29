package com.wdsite.common.constant;

import com.wdsite.common.constant.enums.RoleType;

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
    public static final String salt = "MY_SALT";
    
	/**
     * 用户注册默认角色
     */
    public static final int DEFAULT_REGISTER_ROLE = RoleType.USER.getType();
    
    /**
     * 超级管理员
     */
    public static final int SUPER_ADMIN = RoleType.SYS_ADMIN.getType();

    /**
     * 验证码过期时间
     */
    public static final Long PASS_TIME =  50000 * 60 *1000L;

}
