package com.ajit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ajit.config.AppConfig;
import com.ajit.sbeans.InvoiceService;

public class App {
	
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);){
        	InvoiceService invoiceService = ac.getBean(InvoiceService.class);
        	invoiceService.printInvoice();
        }
        catch (Exception e) {
        	e.printStackTrace();
     }
        
   }
    
 }



