package com.example.employeemanagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employeemanagementSystem.modal.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
