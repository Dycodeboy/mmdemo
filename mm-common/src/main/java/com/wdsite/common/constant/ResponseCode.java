package com.wdsite.common.constant;

public enum ResponseCode {
	
	OK(200, "request was processed properly"),
	MovedTemporarily(301, "target has moved temporarily."),
	MovedPermanently(302, "target has moved permanently."),
	BadRequest(400, "bad request:"),
	Unauthorized(401, "need to login first."),
	Forbidden(403, "you are not allowed to access this resource."),
	UnprocessableEntity(422, "reason:"),
	InternalServerError(500, "an unexpected failure happened - we are already fixing.");
	
	private Integer code;
	private String description;
	
	ResponseCode(Integer code, String desc) {
		this.setCode(code);
		this.setDescription(desc);
	}

	public String getDescription() {
		return description;
	}

	private void setDescription(String description) {
		this.description = description;
	}

	public Integer getCode() {
		return code;
	}

	private void setCode(Integer code) {
		this.code = code;
	}

}
