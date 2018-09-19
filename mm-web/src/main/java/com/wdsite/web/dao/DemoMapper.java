package com.wdsite.web.dao;

import java.util.List;

import com.wdsite.web.pojo.Demo;

public interface DemoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Demo record);

    Demo selectByPrimaryKey(Long id);

    List<Demo> selectAll();

    int updateByPrimaryKey(Demo record);
}