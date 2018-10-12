package com.wdsite.demo.model.service.impl;

import com.wdsite.demo.model.entity.Demo;
import com.wdsite.demo.model.mapper.DemoMapper;
import com.wdsite.demo.model.service.IDemoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Dy
 * @since 2018-09-26
 */
@Service
public class DemoServiceImpl extends ServiceImpl<DemoMapper, Demo> implements IDemoService {

}
