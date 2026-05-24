package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
      AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
      School sc = ctx.getBean(School.class);
      sc.showDetails();
 
	}

}
