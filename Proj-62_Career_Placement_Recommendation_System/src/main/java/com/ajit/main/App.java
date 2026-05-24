package com.ajit.main;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ajit.config.AppConfig;
import com.ajit.sbeans.PlacementService;
import com.ajit.sbeans.Student;

public class App {
	
    public static void main(String[] args) {
      
    	try(AnnotationConfigApplicationContext ctx =
    			new AnnotationConfigApplicationContext(AppConfig.class)){
    		
    		PlacementService placementService = ctx.getBean(PlacementService.class);
    		placementService.getPlacementRecommendation(new Student("Ajit", 101, "Hyderabad"));
    	}catch (Exception e) {
		
    		e.printStackTrace();
    	}
    }
}
