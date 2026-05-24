package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig 
{
	@Bean("pr")
	public PrincipalClass getPrincipleBean()
	{
		PrincipalClass p=new PrincipalClass();
		p.setExperience(5);
		p.setName("Ajit kumar");
		return p;
	}
	@Bean("st")
	public Address getAddressBean()
	{
	
		Address ad=new Address();
		ad.setCity("jamshedpur");
		ad.setState("jharkhand");
		return ad;
	}
	@Bean("sc")
	public School getSchoolBean()
	{
	
	School sc=new School();
	sc.setAddress(getAddressBean());
	sc.setPrincipal(getPrincipleBean());
	sc.setSchoolName("Somaya");
		return sc;
	}
}
