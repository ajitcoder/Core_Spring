package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.demo")
public class AppConfig {

	@Bean 
	public Doctor getDoctorObj() {
     return new Doctor("Dr. Meena Gupta","Cardiologist");
	}
	
	@Bean
	public Equipment getEquipmentObj() {
		
		return new Equipment("ECG Machine",250000);
	}
	
	@Bean
	public Hospital getHospitalObj() {
		
		return new Hospital("City Care Hospital", getDoctorObj(), getEquipmentObj());
	}
}


