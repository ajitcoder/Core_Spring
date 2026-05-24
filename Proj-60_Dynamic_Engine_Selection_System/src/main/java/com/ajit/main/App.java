package com.ajit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ajit.confg.AppConfg;
import com.ajit.sbeans.Car;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfg.class);
        Car bean = ctx.getBean(Car.class);
        bean.showCarDetails();
        
    }
}
