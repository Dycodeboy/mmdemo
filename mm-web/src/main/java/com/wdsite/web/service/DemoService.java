package com.wdsite.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wdsite.web.dao.DemoMapper;
import com.wdsite.web.pojo.Demo;

@Service
public class DemoService {
	
	@Autowired
	private DemoMapper dao;
	
	public List<Demo> getList() {
		return dao.selectAll();
	}
}
