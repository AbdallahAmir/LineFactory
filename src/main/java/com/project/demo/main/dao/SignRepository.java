package com.project.demo.main.dao;

import java.util.List;

import javax.xml.crypto.Data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import com.project.demo.main.entity.Sign;
@Repository
public interface SignRepository extends JpaRepository<Sign, Integer> {
	
	
	
	
	
	
	@Modifying
	@Transactional
	@Query(value= "INSERT INTO sign "
			+ "(employee_id) "
			+ "VALUES  (?1)",nativeQuery=true)
	public void signin(@Param(value="employee_id") int employee_id);
	
	@Modifying
	@Transactional
	@Query(value= "UPDATE sign SET sign_out = CURRENT_TIMESTAMP() WHERE employee_id =?1",nativeQuery=true)
	public void update(@Param(value="id")int employee_id);
	
	@Query(value="SELECT sign_in,sign_out FROM sign WHERE employee_id ="
                                             + " (SELECT employee_id from employee "
                                             + " where employee_name = :employee_name)",nativeQuery = true)
	public List<String> selectHistory(@Param(value="employee_name")String employee_name);
	
	
	
}
