package com.example.demo;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext ac = new FileSystemXmlApplicationContext("src/com/example/demo/Config.xml");
		Student student = (Student) ac.getBean("stu");
		student.displayStudentInfo();
		
	}

}
