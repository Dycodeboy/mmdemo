package com.wdsite.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.wdsite")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}