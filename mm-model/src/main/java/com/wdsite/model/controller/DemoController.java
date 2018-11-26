package com.wdsite.model.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wdsite.model.entity.Demo;
import com.wdsite.model.service.IDemoService;

import io.swagger.annotations.Api;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Dy
 * @since 2018-09-26
 */
@RestController
@Api
@RequestMapping("/demo")
public class DemoController {
	
	@Autowired
	private IDemoService demoService;
	
	@RequestMapping("test1")
	public Demo Test() {
		System.out.println(demoService.getById(3));
		return demoService.getById(3);
		
	}

}
