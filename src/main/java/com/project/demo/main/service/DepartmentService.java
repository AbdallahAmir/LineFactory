package com.project.demo.main.service;

import java.util.List;

import com.project.demo.main.entity.Department;

public interface DepartmentService {
	public List<Department> findAll();
	public Department findById(int theId);
	public void  save(Department theDepartment);
	public void deleteById(int theId);

}
