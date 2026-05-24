package com.ajit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ajit.config.AppConfig;
import com.ajit.sbeans.BookingManager;
import com.ajit.sbeans.TransportService;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        	
         BookingManager bookingManager = ctx.getBean(BookingManager.class);
         bookingManager.showBookingDetails("Hyd", "Delhi");
        }
    }

