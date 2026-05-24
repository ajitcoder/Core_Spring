package com.main.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ajit.comps.BookingManager;
import com.ajit.confg.AppConfg;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfg.class);
    	BookingManager bean1 = ctx.getBean(BookingManager.class);
    	BookingManager bean2 = ctx.getBean(BookingManager.class);
    	bean1.bookTicket("Hyderabad", "Ranchi");
    	System.out.println();
    	bean2.bookTicket("Delhi", "Patna");
    	
    }
}
