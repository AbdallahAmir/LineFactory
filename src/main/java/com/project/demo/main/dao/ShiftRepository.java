package com.project.demo.main.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.demo.main.entity.Shift;
@Repository
public interface ShiftRepository extends JpaRepository<Shift, Integer>{
	/*
	 * @Query(value= "update shift s set s.from = :from where s.id=id",nativeQuery =
	 * true) public void update(@Param("shift_id") int shift_id,@Param("from") int
	 * from);
	 */
	  @Transactional
	  @Modifying
	  @Query(
	  value="UPDATE shift SET shift_from = :shift_from ,shift_to = :shift_to ,working_days = :working_days WHERE shift_id = :shift_id"
	  ,nativeQuery = true ) 
	  public void updateShift( int shift_from, int shift_to,  int working_days,@Param(value="shift_id") int id);
	  
	  
	  
	 

}
