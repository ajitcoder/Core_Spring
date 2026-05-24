package com.ajit.main;

import javax.xml.catalog.CatalogException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ajit.config.AppConfig;
import com.ajit.sbeans.Library;

public class App {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);){
        	Library library = ac.getBean(Library.class);
        	library.dispalyLibraryInfo();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}
