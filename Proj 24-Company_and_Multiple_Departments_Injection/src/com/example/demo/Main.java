package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Company company = ctx.getBean(Company.class);
		company.showDepartments();
	}

    
}
