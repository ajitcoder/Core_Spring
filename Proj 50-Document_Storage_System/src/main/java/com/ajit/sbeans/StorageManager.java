package com.ajit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("storageManager")
public class StorageManager {
	
	@Autowired
	@Qualifier("cloudStorage")
	StorageService storageService;
	
	public void save (String file) {
		
		System.out.println("StorageManager hashcode: "+this.hashCode());
		System.out.println("StorageService hashcode: "+storageService .hashCode());
		storageService.store(file);
	}

}
