package com.example.demo;

import java.util.List;

public class Library {
	
	String libraryName;
	List<Book> books;
	
	public Library(String libraryName, List<Book> books) {
		super();
		this.libraryName = libraryName;
		this.books = books;
	}
	 
	public void showLibraryData() {
		System.out.println("Library: "+libraryName);
		System.out.println("Book Available");
		for(Book b:books) {
			b.displayBookDetails();
			
		}
	}

}
