package com.project.demo.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.demo.main.entity.Department;
import com.project.demo.main.service.DepartmentServices;

@CrossOrigin
@RestController
@RequestMapping("/departments")
public class DepartmentController {
	 @Autowired	
private DepartmentServices departmentServices;
	
   
	
    @GetMapping("/")
    public List<Department> findAll() {
		
		return departmentServices.findAll();
	}
    
    @PostMapping("/save")
    public void createDepartment(@RequestBody Department department) {
    	departmentServices.save(department);
    }
	

}
