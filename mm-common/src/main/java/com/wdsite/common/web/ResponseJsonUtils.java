package com.wdsite.common.web;

import com.wdsite.common.constant.ResponseCode;
import com.wdsite.common.vo.Result;

public class ResponseJsonUtils {
	
	public static Result success(Object date) {
		Result result = new Result(true, ResponseCode.OK.getCode());
		result.setMessage(ResponseCode.OK.getDescription());
		result.setDate(date);
		return result;
	}
	
	public static Result fail(ResponseCode code) {
		Result result = new Result(false, code.getCode());
		result.setMessage(code.getDescription());
		return result;
	}
	
}
