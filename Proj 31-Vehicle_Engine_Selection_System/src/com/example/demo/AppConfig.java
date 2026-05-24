package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.demo")
public class AppConfig {
	@Bean(name="dieselEngine")
	public Engine getDieselEngineObj() {
		
		return new DieselEngine();
	}
	
	@Bean(name="electricEngine")
	public Engine getElectricEngineObj() {
		
		return new ElectricEngine();
	}
	
	@Bean(name="petrolEngine")
	public Engine getPetrolEngineObj() {
		
		return new PetrolEngine();
	}
	
	@Bean
	public Vehicle getVehicleObj() {
		
		return new Vehicle();
	}
}

