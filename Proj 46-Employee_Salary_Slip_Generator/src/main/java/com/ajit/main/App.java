package com.ajit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ajit.config.AppConfig;
import com.ajit.sbeans.SalarySlipService;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
        SalarySlipService bean = ctx.getBean(SalarySlipService.class);
        bean.generateSlip();
    }
}
