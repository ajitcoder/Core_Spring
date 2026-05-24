package com.ajit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ajit.config.AppConfig;
import com.ajit.sbeans.GoalData;
import com.ajit.sbeans.GoalService;

public class App {
	
    public static void main(String[] args) {
       
    	try(AnnotationConfigApplicationContext ctx =
    			new AnnotationConfigApplicationContext(AppConfig.class)){
    		
    		GoalService goalService = ctx.getBean(GoalService.class);
    		goalService.getEvaluation(new GoalData(90.0));
    	}
    }
}
