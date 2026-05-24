package com.example.demo;

public class OrderService {
	
	int orderId;
	PaymentService paymentService;
	
	public OrderService(int orderId, PaymentService paymentService) {
		super();
		this.orderId = orderId;
		this.paymentService = paymentService;
	}
	
	public PaymentService getPaymentService() {
		return paymentService;
	}

	public void setPaymentService(PaymentService paymentService) {
		this.paymentService = paymentService;
	}

	public void processOrder() {
		
		System.out.println("Order placed successfully");
		paymentService.processPayment();
	}

	public OrderService() {
		super();
	}
	
	
	

}
