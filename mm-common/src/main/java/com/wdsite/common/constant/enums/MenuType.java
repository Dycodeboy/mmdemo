package com.wdsite.common.constant.enums;

/**
 * 菜单类型
 * @author wangdi
 * @date 2018年11月29日 下午3:07:01
 *
 */
public enum MenuType {
	/**
	 * 目录
	 */
	CATALOG(0),
	/**
	 * 菜单
	 */
	MENU(1),
	/**
	 * 按钮
	 */
	BUTTON(2);

	private int type;

	private MenuType(int type) {
		this.type = type;
	}

	public int getType() {
		return type;
	}
}
