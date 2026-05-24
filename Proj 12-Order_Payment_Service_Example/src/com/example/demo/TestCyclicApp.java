package com.example.demo;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestCyclicApp {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext ac = new FileSystemXmlApplicationContext("src/com/example/demo/Config.xml");
		OrderService bean = ac.getBean(OrderService.class);
		bean.processOrder();
		
	}

}
