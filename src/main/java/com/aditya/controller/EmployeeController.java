package com.aditya.controller;

import java.util.List;

import org.hibernate.annotations.Target;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aditya.model.Employee;
import com.aditya.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@RequestMapping("/add")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
		employee.setEmpCode("SHI"+employee.getId());
		service.addEmployee(employee);
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);

	}

	@RequestMapping("/delete/{empId}")
	public ResponseEntity<Employee> deleteEmployee(@PathVariable String empId) {
		service.removeEmployee(empId);
		return new ResponseEntity<Employee>(HttpStatus.OK);

	}

	@RequestMapping("/{empId}")
	public ResponseEntity<Employee> getEmployee(@PathVariable String empId) {

		return new ResponseEntity<Employee>(service.getEmployee(empId), HttpStatus.OK);

	}

	@RequestMapping("")
	public ResponseEntity<List<Employee>> getAllEmployees() {

		return new ResponseEntity<List<Employee>>(service.getAllEmployees(), HttpStatus.OK);

	}

	@RequestMapping("/update")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
		employee.setEmpCode("SHI"+employee.getId());
		service.updateEmployee(employee);
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);

	}
	

}
