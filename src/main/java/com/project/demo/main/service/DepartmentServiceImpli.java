package com.project.demo.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.demo.main.dao.DepartmentRepository;
import com.project.demo.main.entity.Department;

public class DepartmentServiceImpli implements DepartmentService {
	
	private DepartmentRepository departmentRepository;
	
    @Autowired
	public DepartmentServiceImpli(DepartmentRepository departmentRepository) {
		
		this.departmentRepository = departmentRepository;
	}

	@Override
	public List<Department> findAll() {
		// TODO Auto-generated method stub
		return departmentRepository.findAll();
	}

	@Override
	public Department findById(int theId) {
		// TODO Auto-generated method stub
		Optional<Department> result = departmentRepository.findById(theId);
		 Department myDepartment=null;
		 if (result.isPresent()) {
			myDepartment=result.get();
		}
		return myDepartment;
	}

	@Override
	public void save(Department theDepartment) {
		
        departmentRepository.save(theDepartment);
	}

	@Override
	public void deleteById(int theId) {
		departmentRepository.deleteById(theId);;

	}

}
