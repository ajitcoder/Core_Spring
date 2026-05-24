package com.ajit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ajit.config.AppConfig;
import com.ajit.sbeans.StorageManager;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        
        StorageManager bean = ctx.getBean(StorageManager.class);
        bean.showFileStore("COllectDoc.pdf");
    }
}
