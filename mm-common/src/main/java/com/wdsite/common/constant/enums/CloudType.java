package com.wdsite.common.constant.enums;

/**
 * 云服务商
 * @author wangdi
 * @date 2018年11月29日 下午3:11:47
 *
 */
public enum CloudType {

	/**
	 * 阿里云
	 */
	ALIYUN(1),
	/**
	 * 腾讯云
	 */
	QCLOUD(2);

	private int type;

	private CloudType(int type) {
        this.type = type;
    }

	public int getType() {
		return type;
	}
}
