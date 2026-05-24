package com.ajit.sbeans;

import org.springframework.stereotype.Component;

@Component("jio")
public class JioSim implements ISimCard {

	@Override
	public String getSimDetails() {
		
		return "Jio SIM: 5G Network + OTT Pack, ₹399/month"
;
	}

}
