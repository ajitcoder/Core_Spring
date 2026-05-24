package com.ajit.sbeans;

import org.springframework.stereotype.Component;

@Component("petrol")
public class PetrolEngine implements IEngine {

	@Override
	public String start() {
		// TODO Auto-generated method stub
		return "Starting Petrol Engine — smooth ignition!"
;
	}

}
