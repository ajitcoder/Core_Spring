package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.demo")
public class AppConfig {
	@Bean
	Bank bank() {
		Bank bank=new Bank();
		
		bank.setBankName("Axis Bank");
		
		Map<String,String> map=new HashMap<>();
		map.put("B001", "Hyderabad");
		map.put("B002", "Chennai");
		map.put("B003","Pune");
		bank.setBranches(map);
		
		//or
//		bank.setBranches(Map.of("B001", "Hyderabad","B002", "Chennai","B003","Pune"));
		return bank;
	}
}


