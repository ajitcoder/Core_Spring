package com.example.demo;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext ac = new FileSystemXmlApplicationContext("src/com/example/demo/Config.xml");
		Teacher bean = ac.getBean(Teacher.class);
		bean.showTeacherInfo();
	}

}
