package com.project.demo.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.demo.main.dao.DepartmentRepository;
import com.project.demo.main.entity.Department;

@Service
public class DepartmentServices {
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
   
	
	public List<Department> findAll() {
		
		return departmentRepository.findAll();
	}


	public Department findById(int theId) {
		// TODO Auto-generated method stub
		Optional<Department> result = departmentRepository.findById(theId);
		 Department myDepartment=null;
		 if (result.isPresent()) {
			myDepartment=result.get();
		}
		return myDepartment;
	}

	
	public void save(Department theDepartment) {
		
        departmentRepository.save(theDepartment);
	}

	
	public void deleteById(int theId) {
		departmentRepository.deleteById(theId);;

	}

}
