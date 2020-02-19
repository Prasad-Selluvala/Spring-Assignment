package com.emp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class EmployeeUtils {
	
	public List<Employee> addValues(Employee emp){
		List<Employee> employeesList = new ArrayList<Employee>();
		Employee employee = new Employee();
		employee.setId("10");
		employee.setName("india");
		employee.setDept("IT");
		Employee employee1 = new Employee();
		employee1.setId("10");
		employee1.setName("india");
		employee1.setDept("IT");
		Employee employee2 = new Employee();
		employee2.setId("10");
		employee2.setName("india");
		employee2.setDept("IT");
		employeesList.add(employee);
		employeesList.add(employee2);
		employeesList.add(employee1);
		employeesList.add(emp);
		return employeesList;
		
	}

}
