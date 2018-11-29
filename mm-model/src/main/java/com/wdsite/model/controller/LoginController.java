package com.wdsite.model.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.wdsite.common.constant.enums.ResponseCode;
import com.wdsite.common.web.ReJsonUtils;

@RestController
public class LoginController {
	
	private final static Logger logger = LoggerFactory.getLogger(LoginController.class);
	
//	@GetMapping(path="/login")
//	public ModelAndView login1(HttpServletRequest req, HttpServletResponse resp) {
//		
//	}
	
	@PostMapping(path="/login")
	public String login(HttpServletRequest req, HttpServletResponse resp) {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		System.out.println(username);
		System.out.println(password);
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(username, password);
		try {
			subject.login(token);
		} catch (Exception e) {
			logger.info("登录失败："+e.getMessage());
		}
		if(subject.isAuthenticated()) {
			return JSON.toJSONString(new ReJsonUtils().success("login success"));
		}else {
			return JSON.toJSONString(ReJsonUtils.fail(ResponseCode.Forbidden));
		}
	}
}
