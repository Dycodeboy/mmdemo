package com.wdsite.common.util;

import com.wdsite.common.vo.ResponseMessage;

public class ResponseJsonUtils {
	
	public static ResponseMessage success(Object date) {
		ResponseMessage result = new ResponseMessage(true);
		result.setDate(date);
		return result;
	}
	
	public static ResponseMessage fail(String message) {
		ResponseMessage result = new ResponseMessage(false);
		result.setMessage(message);
		return result;
	}
	
}
