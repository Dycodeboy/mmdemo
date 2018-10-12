package com.wdsite.demo.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wdsite.demo.model.Application;
import com.wdsite.demo.model.entity.Demo;
import com.wdsite.demo.model.mapper.DemoMapper;
import com.wdsite.demo.model.service.IDemoService;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class Testt {
	
	@Autowired
	private IDemoService demoService;
	
	@Autowired
	private DemoMapper demoDao;

	@Test
	public void test() {
		
		/*
	     * 实体带查询使用方法  输出看结果
	     */
		QueryWrapper<Demo> qw = new QueryWrapper<Demo>(new Demo());
		qw.eq("id", 3);
		System.out.println(qw.getSqlSegment());
		List<Demo> list = demoDao.selectList(qw);
		
		System.out.println(list.get(0).getName());
		
		System.out.println(demoService.count(qw));
		
		
	}
	
	@Test
	public void testDelete() {
		
		/*
	     * 实体带查询使用方法  输出看结果
	     */
		QueryWrapper<Demo> qw = new QueryWrapper<Demo>(new Demo());
		qw.eq("id", 1);
		
//		System.out.println(demoService.removeById(2));
		
		demoService.remove(qw);
		
		
	}

}
