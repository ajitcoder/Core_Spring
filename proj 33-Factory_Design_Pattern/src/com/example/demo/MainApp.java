package com.example.demo;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);){
			ApplianceFactory applianceFactory = ac.getBean(ApplianceFactory.class);
			Appliance appliance = applianceFactory.getAppliance("refrigerator");
			appliance.manufacture();
		}catch(Exception e) {
			e.printStackTrace();
		}

}
}
