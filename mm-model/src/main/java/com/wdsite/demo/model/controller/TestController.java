package com.wdsite.demo.model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wdsite.demo.model.entity.Demo;
import com.wdsite.demo.model.service.IDemoService;

@RestController
@RequestMapping("/demo/shiro")
public class TestController {
	
	@Autowired
	private IDemoService demoService;
	
	@RequestMapping("test1")
	public Demo Test() {
		System.out.println(demoService.getById(3));
		return demoService.getById(3);
		
	}

}
