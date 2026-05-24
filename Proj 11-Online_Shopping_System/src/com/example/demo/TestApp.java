package com.example.demo;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
   
		FileSystemXmlApplicationContext ac = new FileSystemXmlApplicationContext("src/com/example/demo/Config.xml");
		OnlineStore os = (OnlineStore) ac.getBean("ons");
		os.generateInvoice();
		System.out.println("Thank you for shopping with us!");

	}

}
