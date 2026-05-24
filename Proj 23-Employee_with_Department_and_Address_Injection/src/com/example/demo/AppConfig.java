package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	

	    @Bean
	    public Department department() {
	        Department dept = new Department();
	        dept.setDeptId(501);
	        dept.setDeptName("IT");
	        return dept;
	    }

	    @Bean
	    public Address address() {
	        Address addr = new Address();
	        addr.setCity("Pune");
	        addr.setCountry("India");
	        return addr;
	    }

	    @Bean
	    public Employee employee() {
	        Employee emp = new Employee();
	        emp.setEmpId(101);
	        emp.setEmpName("Ajit kumar");
	        emp.setDepartment(department()); // Inject Department bean
	        emp.setAddress(address());       // Inject Address bean
	        return emp;
	    }
	}


