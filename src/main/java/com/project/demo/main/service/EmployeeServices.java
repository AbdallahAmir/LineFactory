package com.project.demo.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.demo.main.dao.EmployeeRepository;
import com.project.demo.main.entity.Employee;

@Service
public class EmployeeServices  {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	
	@Transactional
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Transactional
	public Employee findById(int theId) {
		
		Optional<Employee> result = employeeRepository.findById(theId);
		Employee myEmployee=null;
		if (result.isPresent()) {
			myEmployee=result.get();
		}
		return myEmployee;
	}

	@Transactional
	public List<String> selectDepartmentEmployees(String department_name){
		return employeeRepository.selectDepartmentEmployees(department_name);
	}
	
	@Transactional
	public void deleteById(int theId) {
	employeeRepository.deleteById(theId);

	}


	public void addEmployee(Employee employee) {
			employeeRepository.save(employee);
		}

	public Employee login(String email,String password) {
		return adminLogin(email, password);
	}

	public Employee adminLogin(String email,String password) {
		
		return employeeRepository.adminLogin(email, password);
	}
    public Employee managerLogin(String email,String password) {
		
		return employeeRepository.managerLogin(email, password);
	}

		
	}


