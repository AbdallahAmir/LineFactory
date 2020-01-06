package com.project.demo.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.demo.main.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}
