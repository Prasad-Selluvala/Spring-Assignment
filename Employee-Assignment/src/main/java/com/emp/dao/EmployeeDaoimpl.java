package com.emp.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.emp.controller.Employee;
import com.emp.controller.EmployeeUtils;

@Component
public class EmployeeDaoimpl implements EmployeeDao {

	@Autowired
	private EmployeeUtils uti;
	List<Employee> listemp = new ArrayList<Employee>();

	public Boolean saveEmployees(Employee emp) {
		listemp.add(emp);
		System.out.println("Employee Data Saved Successfully With ID:" + emp.getId() + "\n"+"Name :" + emp.getName());
		return true;
	}

	public Employee findByID(String id) {
		Employee e1 = new Employee();
		for (Employee e : listemp) {

			if (e.getId().equalsIgnoreCase(id)) {
				System.out.println("\n"+"Employee Record Found With Below Details");
				System.out.println("ID :" + e.getId());
				System.out.println("Name :" + e.getName());
				System.out.println("Dep :" + e.getDept());
			}
		}
		return e1;
	}

	public List<Employee> findByAll() {

		System.out.println("\n"+"Number Of Employee Records is :" + listemp.size());
		return listemp;
	}

	public List<Employee> findByName(String name) {
		for (Employee e : listemp) {

			if (e.getName().equalsIgnoreCase(name)) {
				System.out.println("\n"+"Record Found Name :"+ e.getName()+"\n"+"ID :"+e.getId());
			}
			else{
				System.out.println("\n"+"Record Not Found The Name :"+name);
			}
		}
		return listemp;
	}

	public Boolean deleteById(String id) {

		for (Employee e : listemp) {

			if (e.getId().equalsIgnoreCase(id)) {
				listemp.remove(id);
				System.out.println("\n"+"Employee recored deleted by ID :" + id);
			}
		}
		return true;
	}

}
