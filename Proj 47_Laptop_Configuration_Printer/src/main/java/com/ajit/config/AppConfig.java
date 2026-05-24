package com.ajit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ajit.sbeans.Laptop;

@Configuration
@ComponentScan(basePackages = "com.ajit.sbeans")
public class AppConfig {

	@Bean
	public Laptop getLaptop() {
		
		return new Laptop("Dell", "Intel i7", "16GB");
	}
}
