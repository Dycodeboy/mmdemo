package com.wdsite.demo.model.config;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;

@Configuration
public class DruidDBConfig {

	@Bean
	public ServletRegistrationBean<StatViewServlet> druidServlet() {
		ServletRegistrationBean<StatViewServlet> reg = new ServletRegistrationBean<StatViewServlet>();
		reg.setServlet(new StatViewServlet());
		reg.addUrlMappings("/druid/*");
		// reg.addInitParameter("allow", "127.0.0.1"); //白名单
		reg.addInitParameter("resetEnable", "false");
		return reg;
	}

	@Bean
	public FilterRegistrationBean<WebStatFilter> filterRegistrationBean() {
		FilterRegistrationBean<WebStatFilter> filterRegistrationBean = new FilterRegistrationBean<WebStatFilter>();
		filterRegistrationBean.setFilter(new WebStatFilter());
		Map<String, String> initParams = new HashMap<String, String>();
		// 设置忽略请求
		initParams.put("exclusions", "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*");
		filterRegistrationBean.setInitParameters(initParams);
		filterRegistrationBean.addInitParameter("profileEnable", "true");
		filterRegistrationBean.addInitParameter("principalCookieName", "USER_COOKIE");
		filterRegistrationBean.addInitParameter("principalSessionName", "");
		filterRegistrationBean.addInitParameter("aopPatterns", "com.wdsite.demo.model.service");
		filterRegistrationBean.addUrlPatterns("/*");
		return filterRegistrationBean;
	}

	@Bean(name = "dataSource")
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource dataSource() {
		return new DruidDataSource();
	}

//	// 配置事物管理器
//	@Bean(name = "transactionManager")
//	public DataSourceTransactionManager transactionManager() {
//		return new DataSourceTransactionManager(dataSource());
//	}

}