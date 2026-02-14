package com.example.demo;

public class Library {
	
	Book book1;
	Book book2;
	Book book3;
	public void setBook1(Book book1) {
		this.book1 = book1;
	}
	public void setBook2(Book book2) {
		this.book2 = book2;
	}
	public void setBook3(Book book3) {
		this.book3 = book3;
	}
	
	public void displayBooks() {

		System.out.println("Book1 title:"+book1.displayBookInfo());
		System.out.println("Book2 title:"+book2.displayBookInfo());
		System.out.println("Book3 title:"+book3.displayBookInfo());
	
	
	}

}
