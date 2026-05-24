package com.ajit.sbeans;

import org.springframework.stereotype.Component;

@Component("databaseStorage")
public class DatabaseStorageService implements StorageService {

	@Override
	public void store(String fileName) {

		System.out.println("Storing" + fileName+" in Database");
	}

}
