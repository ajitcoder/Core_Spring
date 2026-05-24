package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.demo")
public class AppConfig {

	@Bean
	public Professor getProfessorObj() {

		return new Professor("Dr. Suresh Iyer", 15);
	}

	@Bean
	public Course getCourseObj() {

		return new Course("Data Science", 6);
	}

	@Bean
	public University getUniversityObj() {

		return new University("National Institute of Technology", getProfessorObj(), getCourseObj());
	}
}
