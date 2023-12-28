package com.example.employeemanagementSystem.service;

import java.util.List;

import com.example.employeemanagementSystem.modal.Employee;

public interface EmployeeServices {

	
	
	List<Employee> getAllEmployee();
    void save(Employee employee);
    Employee getById(Long id);
    void deleteViaId(long id);
}

