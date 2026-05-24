package com.ajit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ajit.sbeans.Employee;

@Configuration
@ComponentScan(basePackages = "com.ajit.sbeans")
public class AppConfig {
	@Bean
 public Employee getEmployee() {
	 return new Employee(101,"John",30000,10000,10000,10);
 }
}