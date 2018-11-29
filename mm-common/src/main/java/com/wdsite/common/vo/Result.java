package com.wdsite.common.vo;

/**
 * 该类定义返回的Json统一格式
 * 相关工具类参考ResponseJsonUtils
 * 
 * @author CodingDy
 * @param <T>
 *
 */
public class Result{
	
	private Boolean success = false;
	
	private String message;
	
	private Integer code;
	
	private Object data;

	public Result(Boolean success, Integer code) {
		this.success = success;
		this.code = code;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String msg) {
		this.message = msg;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
