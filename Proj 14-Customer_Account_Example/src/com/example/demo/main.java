package com.example.demo;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext ac = new FileSystemXmlApplicationContext("src/com/example/demo/Config.xml");
		Customer customer = ac.getBean(Customer.class);
		customer.displayCustomerInfo();
		
		Account account = ac.getBean(Account.class);
		account.displayAccountInfo();

	}

}
