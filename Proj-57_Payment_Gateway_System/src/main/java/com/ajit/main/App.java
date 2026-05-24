package com.ajit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ajit.config.AppConfig;
import com.ajit.sbeans.PaymentProcessor;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
        PaymentProcessor paymentProcessor = ctx.getBean(PaymentProcessor.class);
        paymentProcessor.processPayment("Ajit", 2000);
        
    }
}
