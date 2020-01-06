package com.project.demo.main.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import com.project.demo.main.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	

}
