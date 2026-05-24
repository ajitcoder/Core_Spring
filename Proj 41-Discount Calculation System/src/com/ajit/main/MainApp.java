package com.ajit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ajit.comps.BillingService;
import com.ajit.confg.AppConfig;

public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		BillingService billingService = ac.getBean(BillingService.class);
		billingService.generateBill(1000.0);


	}

}
