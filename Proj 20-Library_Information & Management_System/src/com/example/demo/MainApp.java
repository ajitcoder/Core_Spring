package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("/com/example/demo/Config.xml");
		Librarian librarian = ac.getBean("librn",Librarian.class);
		librarian.manageLibrary();
	}

}
