package com.ajit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ajit.config.AppConfig;
import com.ajit.sbeans.SatelliteControlCenter;

public class App {
	
    public static void main(String[] args) {
        
    	try(AnnotationConfigApplicationContext ctx =
    			new AnnotationConfigApplicationContext(AppConfig.class)){
    		
    		SatelliteControlCenter satelliteControlCenter = ctx.getBean(SatelliteControlCenter.class);
    		
    		satelliteControlCenter.activateSatellite("India Station");
    	}catch (Exception e) {
			
    		e.printStackTrace();
		}
    }
}