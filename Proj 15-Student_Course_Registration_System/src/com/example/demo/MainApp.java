package com.example.demo;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext ac = new FileSystemXmlApplicationContext("src/com/example/demo/Config.xml");
		University university = ac.getBean(University.class);
		university.displayUniversityData();

	}

}
