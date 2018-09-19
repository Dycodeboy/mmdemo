package com.wdsite.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wdsite.web.pojo.Demo;
import com.wdsite.web.service.DemoService;

@RestController
@RequestMapping("/")
public class DemoController {
	
	@Autowired
	private DemoService service;

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String index() {
		return "1123";
	}
	
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public List<Demo> test() {
		return service.getList();
	}
}
