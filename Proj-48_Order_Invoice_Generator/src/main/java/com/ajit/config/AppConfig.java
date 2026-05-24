package com.ajit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ajit.sbeans.Product;

@Configuration
@ComponentScan(basePackages = "com.ajit.sbeans")
public class AppConfig {
	
	@Bean
	Product product() {
		Product product = new Product("Laptop",50000,2);
		return product;
		
	}

}
