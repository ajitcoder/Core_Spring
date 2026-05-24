package com.ajit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ajit.config.AppConfig;
import com.ajit.sbeans.Retailer;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
        ctx.getBean(Retailer.class).showSimInfo();
    }
}
