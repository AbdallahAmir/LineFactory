package com.project.demo.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.demo.main.dao.EmployeeRepository;
import com.project.demo.main.entity.Employee;

@Service
public class EmployeeServiceImpli implements EmployeeService {
    
	private EmployeeRepository employeeRepository;
	
	@Autowired
	public EmployeeServiceImpli(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	@Transactional
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	@Transactional
	public Employee findById(int theId) {
		
		Optional<Employee> result = employeeRepository.findById(theId);
		Employee myEmployee=null;
		if (result.isPresent()) {
			myEmployee=result.get();
		}
		return myEmployee;
	}

	@Override
	@Transactional
	public void save(Employee theEmployee) {
		employeeRepository.save(theEmployee);

	}

	@Override
	@Transactional
	public void deleteById(int theId) {
	employeeRepository.deleteById(theId);

	}

}
