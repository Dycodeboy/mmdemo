package com.wdsite.common.constant.enums;

/**
 * 用户角色类型
 * @author wangdi
 * @date 2018年11月29日 下午3:04:34
 */
public enum RoleType {
	/** 超级管理员 */
	SYS_ADMIN(0, "sysadmin"),
	/** 管理员 */
	ADMIN(1, "admin"),
	/** 普通用户 */
	USER(5, "user");

	private int type;
	private String value;

	private RoleType(int type, String value) {
		this.type = type;
		this.value = value;
	}

	public int getType() {
		return type;
	}

	public String getValue() {
		return value;
	}
}
