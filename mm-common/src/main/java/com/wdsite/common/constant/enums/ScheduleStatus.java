package com.wdsite.common.constant.enums;

/**
 * 
 * 定时任务状态
 * @author wangdi
 * @date 2018年11月29日 下午3:09:04
 *
 */
public enum ScheduleStatus {

	/**
     * 正常
     */
	NORMAL(0),
    /**
     * 暂停
     */
	PAUSE(1);

    private int type;

    private ScheduleStatus(int type) {
        this.type = type;
    }
    
    public int getType() {
        return type;
    }
}
