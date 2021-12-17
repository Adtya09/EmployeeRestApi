package com.aditya.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController  {
	@GetMapping("")
	public String homeRedirect() {
		StringBuilder builder= new StringBuilder("Below are the endpoints for Rest-API");
		builder.append("\n");
		builder.append("Get All Employees -> " + "https://employee-management-restapi.herokuapp.com/employee");
		builder.append("\n");
		builder.append("Get  Employee -> " + "https://employee-management-restapi.herokuapp.com/employee/{id}");
		builder.append("\n");
		builder.append("Add Employee -> " + "https://employee-management-restapi.herokuapp.com/employee/add");
		builder.append("\n");
		builder.append("Update Employees -> " + "https://employee-management-restapi.herokuapp.com/employee/update");
		builder.append("\n");
		builder.append("Delete Employees -> " + "https://employee-management-restapi.herokuapp.com/employee/delete/{id}");
		builder.append("\n");
		return builder.toString();
	}
}
