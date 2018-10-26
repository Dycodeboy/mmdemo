package com.wdsite.common.vo;

/**
 * 该类定义返回的Json统一格式
 * 相关工具类参考ResponseJsonUtils
 * 
 * @author CodingDy
 *
 */
public class Result{
	
	private Boolean success;
	
	private String message;
	
	private Integer code;
	
	private Object date;

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

	public Object getDate() {
		return date;
	}

	public void setDate(Object date) {
		this.date = date;
	}
	
}
