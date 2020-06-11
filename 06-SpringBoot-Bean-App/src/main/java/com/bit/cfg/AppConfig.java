package com.bit.cfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bit.utils.Car;

@Configuration
public class AppConfig {
	public AppConfig() {
		System.out.println("*****AppConfig.class---@Configuration");
	}
	
	@Bean
	public String test() {
		System.out.println("*****AppConfig.class-String--@Configuration @Bean");
		return "m";
	}

	@Bean
	public Car beanInstance() {
		System.out.println("AppConfig.beanInstance()");
		Car c=new Car();
		return c;
	}

	}
