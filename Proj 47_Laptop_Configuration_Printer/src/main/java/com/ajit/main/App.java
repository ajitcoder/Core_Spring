package com.ajit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ajit.config.AppConfig;
import com.ajit.sbeans.LaptopService;

public class App {
    public static void main(String[] args) {
       
    	try(AnnotationConfigApplicationContext ctx =
    			new AnnotationConfigApplicationContext(AppConfig.class)){
    		
    		LaptopService laptopService = ctx.getBean(LaptopService.class);
    		laptopService.printLaptopDetails();
    	}catch (Exception e) {
			
    		e.printStackTrace();
		}
    }
}
