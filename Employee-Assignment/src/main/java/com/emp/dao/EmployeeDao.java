package com.emp.dao;

import java.util.List;

import com.emp.controller.Employee;

public interface EmployeeDao {
	
	Boolean saveEmployees(Employee emp);
	Employee findByID(String id);
	List<Employee> findByAll();
	List<Employee> findByName(String name);
	Boolean deleteById(String id);
	

}
