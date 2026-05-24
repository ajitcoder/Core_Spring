package com.ajit.sbeans;

import org.springframework.stereotype.Component;

@Component("cloudStorage")
public class CloudStorageService implements StorageService {

	@Override
	public void store(String fileName) {
		System.out.println("Storing" + fileName+" in Cloud Storage");
		
	}

}
