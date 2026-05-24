package com.ajit.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Library {
	
	@Value("${library.name}")
	private String name;
	
	@Value("${library.location}")
	private String location;
	
	@Value("${library.maxBooks}")
	private int maxBooks;

	@Value("${library.openingHours}")
	private String openingHours;
	
	@Value("${library.closedOn}")
	private String closedOn;
	
	@Value("${library.contactEmail}")
	private String contactEmail;
	
	
	public void dispalyLibraryInfo() {
		System.out.println("Library Name: "+name);
		System.out.println("Locatio: "+location);
		System.out.println("Max Book: "+maxBooks);
		System.out.println("Opening Hours: "+openingHours);
		System.out.println("Closed On: "+closedOn);
		System.out.println("Contact Email: "+contactEmail);
	}
}
