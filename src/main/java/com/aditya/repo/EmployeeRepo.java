package com.aditya.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aditya.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	Employee findEmployeeById(Integer empId);

	
}
