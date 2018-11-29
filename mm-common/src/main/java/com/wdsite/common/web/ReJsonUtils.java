package com.wdsite.common.web;

import com.wdsite.common.constant.enums.ResponseCode;
import com.wdsite.common.vo.Result;

public class ReJsonUtils {
	
	/**
	 * 返回成功结果
	 * @param data
	 * @return
	 */
	public Result success(Object data) {
		Result result = new Result(true, ResponseCode.OK.getCode());
		result.setMessage(ResponseCode.OK.getDescription());
		return result;
	}
	
	public static Result fail(ResponseCode code) {
		Result result = new Result(false, code.getCode());
		result.setMessage(code.getDescription());
		return result;
	}
	
}
