package com.ajit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ajit.confg.AppConfg;
import com.ajit.sbeans.BikeRentalService;
import com.ajit.sbeans.CarRentalService;
import com.ajit.sbeans.RentalManager;
import com.ajit.sbeans.TruckRentalService;

public class App {
    public static void main(String[] args) {
     AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfg.class);
     
     BikeRentalService b1=ctx.getBean( BikeRentalService.class);
     BikeRentalService b2=ctx.getBean( BikeRentalService.class);
     CarRentalService c1= ctx.getBean(CarRentalService.class);
     CarRentalService c2= ctx.getBean(CarRentalService.class);
     TruckRentalService t1=ctx.getBean(TruckRentalService.class);
     TruckRentalService t2=ctx.getBean(TruckRentalService.class);
     
                          RentalManager bean = ctx.getBean(RentalManager.class);
                          bean.rentBook("Raj Malhotra ");
     System.out.println("RentalService (prototype) new instance? "+(b1.hashCode()==b2.hashCode()));
     System.out.println("CarRentalService (singleton) same instance? "+(c1.hashCode()==c2.hashCode()));
     System.out.println("TruckRentalService (singleton) same instance? "+(t1.hashCode()==t2.hashCode()));
    }
}
