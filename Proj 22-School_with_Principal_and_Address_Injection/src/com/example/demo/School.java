package com.example.demo;



public class School {
	String schoolName;
	PrincipalClass principal;
	Address address;

	public void setSchoolName(String name) {
		this.schoolName= name;
	}
	public void setPrincipal(PrincipalClass principal) {
		this.principal = principal;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void showDetails() {
        System.out.println("School: " + schoolName);
        principal.displayPrincipalInfo();
        address.displayAddressInfo();
}
}