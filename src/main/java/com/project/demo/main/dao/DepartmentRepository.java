package com.project.demo.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.demo.main.entity.Department;
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>{
	

}
