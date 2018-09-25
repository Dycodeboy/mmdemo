package com.wdsite.demo.service.impl;

import com.wdsite.demo.entity.Demo;
import com.wdsite.demo.mapper.DemoMapper;
import com.wdsite.demo.service.IDemoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Dy
 * @since 2018-09-25
 */
@Service
public class DemoServiceImpl extends ServiceImpl<DemoMapper, Demo> implements IDemoService {

}
