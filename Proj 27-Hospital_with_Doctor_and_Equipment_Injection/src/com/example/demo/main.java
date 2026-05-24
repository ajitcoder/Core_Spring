package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {

	public static void main(String[] args) {
		try( AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(AppConfig.class);){
			
			    Hospital hospital = ctx.getBean(Hospital.class);
			    hospital.showDetails();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
