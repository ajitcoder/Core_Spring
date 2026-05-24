package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);){
			VehicleFactory vehicleFactory = ac.getBean(VehicleFactory.class);
				Vehicle vehicle = vehicleFactory.getVehicle("car");
				vehicle.assemble();
			}catch(Exception e) {
				e.printStackTrace();
			}

	}

}
