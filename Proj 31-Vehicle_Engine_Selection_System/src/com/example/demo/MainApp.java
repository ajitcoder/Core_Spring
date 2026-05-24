package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		try( AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(AppConfig.class)){
			
			Vehicle vehicle = ctx.getBean(Vehicle.class);
			vehicle.startvehicle();
		}catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
