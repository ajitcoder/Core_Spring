package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/example/demo/Config.xml");
		Library bean = ctx.getBean(Library.class);
		bean.displayBooks();

	}

}
