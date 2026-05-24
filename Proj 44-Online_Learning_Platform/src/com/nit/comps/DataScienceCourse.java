package com.nit.comps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class DataScienceCourse implements Course {
 @Autowired
 @Qualifier("classroomDelivery")
	DeliveryMode deliverymode;
	@Override
	public String getCourseName() {
		
		return "Data Science with ML";
	}

}
