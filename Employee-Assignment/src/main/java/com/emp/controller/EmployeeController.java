package com.emp.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

import com.emp.service.EmployeeServiceImpl;
import com.emp.service.EmployeeServiceReaderImpl;

@Configuration
@ComponentScan("com")
public class EmployeeController {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext ac = new AnnotationConfigApplicationContext(EmployeeController.class);
		
		EmployeeServiceImpl empl = ac.getBean(EmployeeServiceImpl.class);
		
			Employee employee = new Employee();
			employee.setId("2");
			employee.setName("MANI");
			employee.setDept("IT");
			empl.saveEmployee(employee);
			empl.findById(1);
			empl.findAll();
			empl.findByName("MANI");
			empl.deleteById(1);
			
			System.out.println("-----------------EmployeeServiceReaderImpl-------------------");
			
		EmployeeServiceReaderImpl emp = ac.getBean(EmployeeServiceReaderImpl.class);
			emp.findById(1);
			emp.findAll();
			emp.findByName("SUNIL");
			
				
	}
}
