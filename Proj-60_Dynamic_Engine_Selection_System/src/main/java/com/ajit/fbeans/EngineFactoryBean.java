package com.ajit.fbeans;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.ajit.sbeans.DieselEngine;
import com.ajit.sbeans.ElectricEngine;
import com.ajit.sbeans.IEngine;
import com.ajit.sbeans.PetrolEngine;
@Component("mainEngine")
public class EngineFactoryBean implements FactoryBean<IEngine> {

	@Value("${engine.type}")
	String type;
	
	@Override
	public IEngine getObject() throws Exception {
		if(type.equalsIgnoreCase("petrol"))
			return new PetrolEngine();
		else if(type.equalsIgnoreCase("diesel"))
			return new DieselEngine();
		else if(type.equalsIgnoreCase("electric")) {
			return  new ElectricEngine();
		}
		else 
		return null;
	}

	@Override
	public Class<?> getObjectType() {
		
		return IEngine.class;
	}

}
