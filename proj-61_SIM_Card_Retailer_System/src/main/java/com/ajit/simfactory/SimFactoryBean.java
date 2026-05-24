package com.ajit.simfactory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.ajit.sbeans.AirtelSim;
import com.ajit.sbeans.ISimCard;
import com.ajit.sbeans.JioSim;
import com.ajit.sbeans.ViSim;
@Component("mainSim")
public class SimFactoryBean implements FactoryBean<ISimCard> {
   
	@Value("${sim.type}")
	String type;
	@Override
	public ISimCard getObject() throws Exception {
		if(type.equalsIgnoreCase("jio"))
		return new JioSim();
		else if(type.equalsIgnoreCase("airtel"))
		return new AirtelSim();
		else if(type.equalsIgnoreCase("vi"))
			return new ViSim();
			
		return null;
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return ISimCard.class;
	}

}
