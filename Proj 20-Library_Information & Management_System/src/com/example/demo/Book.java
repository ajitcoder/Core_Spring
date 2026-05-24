package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Book {
	
	int bookId;
	String bookTitle;
	Author author;
	
	public Book(int bookId, String bookTitle) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
	}
	@Autowired
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	public void displayBookDetails() {
		System.out.println("- Book: "+bookTitle+" | ");
		author.displayAuthorInfo();
	}	

}
