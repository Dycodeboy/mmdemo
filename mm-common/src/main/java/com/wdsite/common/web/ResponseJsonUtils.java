package com.wdsite.common.web;

import com.wdsite.common.constant.ResponseCode;
import com.wdsite.common.vo.Result;

public class ResponseJsonUtils<T> {
	
	/**
	 * 返回成功结果
	 * @param data
	 * @return
	 */
	public Result<T> success(T data) {
		Result<T> result = new Result<T>(true, ResponseCode.OK.getCode());
		result.setMessage(ResponseCode.OK.getDescription());
		return result;
	}
	
	public static Result<Object> fail(ResponseCode code) {
		Result<Object> result = new Result<Object>(false, code.getCode());
		result.setMessage(code.getDescription());
		return result;
	}
	
}
