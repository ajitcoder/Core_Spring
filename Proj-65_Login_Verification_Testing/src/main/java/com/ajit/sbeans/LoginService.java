package com.ajit.sbeans;

public class LoginService {

	public boolean authenticate(String username, String password) {
		
		if(username.equalsIgnoreCase("admin") && password.length()>=6) {
			
			return true;
		}else if(username.equalsIgnoreCase("") || username.equalsIgnoreCase(null)) {
			
			return false;
		}else {
			return false;
		}
		
	}
   
}

