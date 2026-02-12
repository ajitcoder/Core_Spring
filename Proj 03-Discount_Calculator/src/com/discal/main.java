package com.discal;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/discal/Config.xml");
		DiscountCalculator bean = ctx.getBean(DiscountCalculator.class);
		System.out.println(bean.calculateDiscount());;
	}

}
