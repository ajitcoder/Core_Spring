package com.example.demo;

public class PaymentService {
	
	int paymentId;
	OrderService orderService;
	
	

	public PaymentService(int paymentId, OrderService orderService) {
		super();
		this.paymentId = paymentId;
		this.orderService = orderService;
	}



	public PaymentService() {
		super();
	}



	public OrderService getOrderService() {
		return orderService;
	}



	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}



	public void processPayment() {
		
		System.out.println("Payment processed successfully");
		
		
	}

}
