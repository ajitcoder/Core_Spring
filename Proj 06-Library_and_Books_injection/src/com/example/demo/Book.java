package com.example.demo;

public class Book {
	
	String title;
	String author;
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String displayBookInfo() {
		return title+"\tBook author:"+author;
	}

}
