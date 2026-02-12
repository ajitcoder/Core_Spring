package com.nit.electricity;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nit/electricity/Config.xml");
		ElectricityBillGenerator obj = ctx.getBean(ElectricityBillGenerator.class);
		System.out.println("Bill = "+obj.generateBill());

	}

}
