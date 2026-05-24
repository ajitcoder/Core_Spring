package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		Bank bank = ac.getBean(Bank.class);
		
		bank.showBranches();

	}

}
