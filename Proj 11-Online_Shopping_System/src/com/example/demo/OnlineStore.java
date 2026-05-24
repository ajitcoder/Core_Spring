package com.example.demo;

public class OnlineStore {
	
	Order Order;
    BillService billService;
	public OnlineStore(com.example.demo.Order order, BillService billService) {
		super();
		 this.Order = order;
		 this.billService = billService;
	}
    
	public void generateInvoice() {
		Order.showOrderDetails();
		System.out.println("Final Bill: "+billService.calculateTotal(Order));
	}
	

}
