package com.wdsite.common.vo;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * 该类定义返回的Json统一格式
 * 相关工具类参考ResponseJsonUtils
 * 
 * @author CodingDy
 *
 */
public class ResponseMessage extends JSONObject{
	
	public ResponseMessage() {
		try {
			this.put("success", false);
			this.put("msg","");
			this.put("code", 200);
			this.put("date", null);
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}
	
	public ResponseMessage(Boolean success) {
		try {
			this.put("success", success);
			this.put("msg","");
			this.put("code", 200);
			this.put("date", null);
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}
	
	public void setMessage(String message) {
		try {
			this.put("msg", message);
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}
	
	public void setCode(Integer code) {
		try {
			this.put("code", code);
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}
	
	public void setDate(Object date) {
		try {
			this.put("date", date);
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}

}
