package com.wdsite.model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wdsite.model.service.IDemoService;
import com.wdsite.shiro.entity.SysUser;
import com.wdsite.shiro.service.ISysUserService;

@RestController
@RequestMapping("/demo/shiro")
public class TestController {
	
	@Autowired
	private IDemoService demoService;
	
	@Autowired
	private ISysUserService userService;
	
	@RequestMapping("test1")
	public SysUser Test() {
		System.out.println(demoService.getById(3));
		System.out.println(userService.getById(1));
		return userService.getById(1);
		
	}

}
