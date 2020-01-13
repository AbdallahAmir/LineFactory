package com.project.demo.main.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.project.demo.main.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

//	@Modifying
//	@Transactional
//	@Query(value= "INSERT INTO employee "
//			+ "(employee_name,employee_Address,contacts,salary,image,password,employee_email,department_id,shift_id) "
//			+ "VALUES "
//			+ "(?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8,?9)"
//			,nativeQuery=true)
//	public void save(String name,String address,String contacts,double salary
//			, byte[] image, String password, String email,  int department_id,
//			 int shift);
	
//	@Query(value="select * from employee where (employee_email = :employee_email) && (password = :password)",nativeQuery = true)
//	public Employee authenticate(@Param(value="employee_email")String email,@Param(value="password")String password);

	@Query(value="select * from employee where (employee_id = "+1+")&&(employee_email = :employee_email) && (password = :password)",nativeQuery = true)
	public Employee adminLogin(/*@Param(value="employee_id")int employee_id*/@Param(value="employee_email")String employee_email,@Param(value="password")String password);
	
	@Query(value="select * from employee where (employee_id = "+2+")&&(employee_email = :employee_email) && (password = :password)",nativeQuery = true)
	public Employee managerLogin(/*@Param(value="employee_id")int employee_id*/@Param(value="employee_email")String employee_email,@Param(value="password")String password);
	
	
	@Query(value="SELECT employee_name FROM employee WHERE Department_id ="
                                             
                                             + " (SELECT department_id from department "
                                             + " where department_name = :department_name)",nativeQuery = true)
	public List<String> selectDepartmentEmployees(@Param(value="department_name")String department_name);


}
