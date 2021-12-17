package com.aditya.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aditya.model.Employee;
import com.aditya.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo repo;

	public List<Employee> getAllEmployees() {
		return repo.findAll();

	}

	public Employee getEmployee(String empId) {
		return repo.findEmployeeById(Integer.parseInt(empId));
	}

	public void addEmployee(Employee employee) {
		
		repo.save(employee);
	}

	public void updateEmployee(Employee employee) {
		repo.save(employee);
	}

	public void removeEmployee(String empId) {
		repo.deleteById(Integer.parseInt(empId));
	}

}
