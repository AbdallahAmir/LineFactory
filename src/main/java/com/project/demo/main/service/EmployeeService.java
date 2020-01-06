package com.project.demo.main.service;

import java.util.List;

import com.project.demo.main.entity.Employee;

public interface EmployeeService {
	public List<Employee> findAll();
	public Employee findById(int theId);
	public void  save(Employee theEmployee);
	public void deleteById(int theId);

}
