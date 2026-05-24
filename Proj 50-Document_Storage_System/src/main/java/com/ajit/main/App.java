package com.ajit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ajit.config.AppConfig;
import com.ajit.sbeans.StorageManager;

public class App {
    public static void main(String[] args) {

         try(AnnotationConfigApplicationContext ctx =
        		 new AnnotationConfigApplicationContext(AppConfig.class)){
        	 
        	 StorageManager manager1 = ctx.getBean(StorageManager.class);
        	 manager1.save("ReactNotes.pdf");
        	 
             System.out.println();
             
        	 StorageManager manager2 = ctx.getBean(StorageManager.class);
        	 manager2.save("SpringNotes.pdf");
        	 
             System.out.println("manage1 hashCode: "+manager1.hashCode());
             System.out.println("manage2 hashCode: "+manager2.hashCode());
             
         }catch (Exception e) {
			// TODO: handle exception
		}
    }
}
