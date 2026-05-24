package com.ajit.sbeans;

import org.springframework.stereotype.Component;

@Component("fileSystem")
public class FileSystemStorageService implements StorageService {

	@Override
	public void store(String fileName) {
		
		System.out.println("Storing" + fileName+" in Local File System");
		
	}

}
