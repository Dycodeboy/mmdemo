package com.wdsite.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wdsite.demo.entity.Demo;
import com.wdsite.demo.service.IDemoService;

@RestController
@RequestMapping("/demo/shiro")
public class ShiroController {

	
	@Autowired
	private IDemoService demoService;
	
	@RequestMapping("test")
	public Demo test() {
		System.out.println("1231");
		return demoService.getById(3);
	}
}
