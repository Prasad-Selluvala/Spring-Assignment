package com.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.emp.controller.Employee;
import com.emp.dao.EmployeeDao;

@Component
public class EmployeeServiceReaderImpl implements EmployeeServiceRead{
	
	@Autowired
	private EmployeeDao dao;

	@Override
	public Employee findById(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findByName(String empName) {
		// TODO Auto-generated method stub	
		return null;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
