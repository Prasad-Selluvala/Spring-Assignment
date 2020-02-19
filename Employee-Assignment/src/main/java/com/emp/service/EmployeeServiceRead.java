package com.emp.service;

import java.util.List;

import com.emp.controller.Employee;

public interface EmployeeServiceRead {
	
	
	Employee findById(int empId);
	
	Employee findByName(String empName);

	List<Employee> findAll();
	
	
	
	
	
}
