package com.example.demo;

import java.util.List;

public class Library {

	String libraryName;
	List<Book> books;
	
	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}
	
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	public void displayLibraryInfo() {
		System.out.println(libraryName);
		System.out.println("Book Available: ");
		for(Book b:books) {
			b.showBookInfo();
		}
	}
	
}
