package com.ajit.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

@Component("ss")
public class ConfigurationApp 
{
	@Value("${app.name}")
	String Name;
	
	@Value("${app.version}")
	String version;
	
	@Value("${app.description")
	String description;
	
	@Value("${app.author}")
	String author;
	
	@Value("${app.contactEmail}")
	String contactEmail;
	
	@Value("${app.maxUsers}")
	String maxUsers;

	@Override
	public String toString() {
		return "AppConfig [Name=" + Name + ", version=" + version + ", description=" + description + ", author="
				+ author + ", contactEmail=" + contactEmail + ", maxUsers=" + maxUsers + "]";
	}
	
	
}
