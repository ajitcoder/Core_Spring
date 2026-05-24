package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {

	public static void main(String[] args) {
		
		try(ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("com/example/demo/Config.xml");){
			Company company = ac.getBean("comp",Company.class);
			company.showCompanyInfo();
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
