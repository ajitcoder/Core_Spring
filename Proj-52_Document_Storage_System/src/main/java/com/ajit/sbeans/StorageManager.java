package com.ajit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class StorageManager {

	@Autowired
	@Qualifier("fileSystemStorageService")
	StorageService service;
	
	public void showFileStore(String fileName) {
		
		service.store(fileName);
	}
}
