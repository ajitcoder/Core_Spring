package com.date.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.date_printer.DatePrinter;

public class Main {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/date/appxml/applicationContext.xml");
		DatePrinter obj = ctx.getBean("dp",DatePrinter.class);
		obj.printDate();
	}

}
