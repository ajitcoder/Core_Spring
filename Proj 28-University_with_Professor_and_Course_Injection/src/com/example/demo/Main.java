package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		try( AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(AppConfig.class)){

			University university = ctx.getBean(University.class);
			university.showDetails();

		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
