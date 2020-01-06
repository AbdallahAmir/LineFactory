package com.project.demo.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.demo.main.entity.Employee;
import com.project.demo.main.service.EmployeeService;
@CrossOrigin
@RestController
@RequestMapping("/home")
public class EmployeeRestCotroller {

	private EmployeeService employeeService;
	
    @Autowired
	public EmployeeRestCotroller(EmployeeService emloyeeService) {
		this.employeeService = emloyeeService;
	}
    @GetMapping("/employees")
	public List<Employee> findAll(){
		return employeeService.findAll();
	}
	@GetMapping("/employees/{employeeId}")
	public Employee getEmployee(@PathVariable int employeeId) {
		
		Employee theEmployee=employeeService.findById(employeeId);
		if (theEmployee==null) {
			throw new RuntimeException("Employee Id not found"+employeeId);
		}
		
		return theEmployee;
	}

	@PostMapping("/save")
	public Employee addEmployee(@RequestBody Employee theEmployee) {
		
		// also just in case they pass an id in JSON ... set id to 0
		// this is to force a save of new item ... instead of update
		
		theEmployee.setId(0);
		
		employeeService.save(theEmployee);
		
		return theEmployee;
	}

	// add mapping for PUT /employees - update existing employee
	
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee theEmployee) {
		
		employeeService.save(theEmployee);
		
		return theEmployee;
	}
	
	
}
