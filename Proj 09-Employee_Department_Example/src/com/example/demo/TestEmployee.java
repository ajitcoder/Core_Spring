package com.example.demo;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestEmployee {

	public static void main(String[] args) {
		
	FileSystemXmlApplicationContext ac = new FileSystemXmlApplicationContext("/src/com/example/demo/Config.xml");	
		Employee employee = (Employee) ac.getBean("emp");
		employee.showEmployeeInfo();
	}

}
