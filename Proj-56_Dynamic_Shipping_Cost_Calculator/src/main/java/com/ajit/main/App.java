package com.ajit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ajit.config.AppConfig;
import com.ajit.sbeans.ShippingService;

public class App {
    public static void main(String[] args) {
    	try(AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);){
			ShippingService shippingService = ac.getBean(ShippingService.class);
			double shippingCost = shippingService.getShippingCost("airShipping", 5.0);
			System.out.println(shippingCost);
		}catch(Exception e) {
			e.printStackTrace();
		}

    }
}
