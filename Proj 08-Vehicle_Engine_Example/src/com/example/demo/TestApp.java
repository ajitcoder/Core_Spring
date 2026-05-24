package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/example/demo/Config.xml");
		Car bean = ctx.getBean(Car.class);
		bean.displayCarDetails();
	}

}
