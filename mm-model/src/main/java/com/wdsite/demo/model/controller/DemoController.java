package com.wdsite.demo.model.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wdsite.demo.model.entity.Demo;
import com.wdsite.demo.model.service.IDemoService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Dy
 * @since 2018-09-26
 */
@RestController
@RequestMapping("/demo/demo")
public class DemoController {
	
	@Autowired
	private IDemoService demoService;
	
	@RequestMapping("test1")
	public Demo Test() {
		System.out.println(demoService.getById(3));
		return demoService.getById(3);
		
	}

}
