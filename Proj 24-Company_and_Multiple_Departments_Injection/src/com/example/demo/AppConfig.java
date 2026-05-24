package com.example.demo;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
    public Department dept1() {
        Department dept = new Department();
        dept.setDeptId(101);
        dept.setDeptName("IT");
        return dept;
    }

    @Bean
    public Department dept2() {
        Department dept = new Department();
        dept.setDeptId(102);
        dept.setDeptName("HR");
        return dept;
    }

    @Bean
    public Department dept3() {
        Department dept = new Department();
        dept.setDeptId(103);
        dept.setDeptName("Finance");
        return dept;
    }

    
    @Bean
    public Company company() {
        Company company = new Company();
        company.setDepartments(Arrays.asList(dept1(), dept2(), dept3()));
        return company;
    }
}

