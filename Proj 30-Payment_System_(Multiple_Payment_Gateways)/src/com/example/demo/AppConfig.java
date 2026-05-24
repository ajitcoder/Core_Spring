package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.demo")
public class AppConfig {
	
	@Bean
	public PaymentService getPaytmPaymentServiceObj() {
		
		return new PaytmPaymentService();
	}
	
	@Bean(name="googlePayService")
	public PaymentService getGooglePayServiceObj() {
		
		return new GooglePayService();
	}
	
	@Bean
	public PaymentProcessor getPaymentProcessorObj() {
		
		return new PaymentProcessor();
	}
}



