package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		Restaurant restaurant = ac.getBean("restaurant",Restaurant.class);
		
		restaurant.showMenu();

	}

}
