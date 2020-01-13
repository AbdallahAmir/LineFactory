package com.project.demo.main.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.demo.main.entity.Factory;
@Repository
public interface FactoryRepository extends JpaRepository<Factory, Integer>{
	

	  @Transactional
	  @Modifying
	  @Query(
	  value="UPDATE factory SET factory_name = :factory_name ,buildings = :buildings ,floors = "
	  		+ ":floors,industry = :industry,location = :location,owenrname = :owenrname"
	  		+ " WHERE factory_id = :factory_id"
	  ,nativeQuery = true ) 
	  public void updateFactory( String factory_name, int buildings,  int floors,String industry
			  ,String location, String owenrname,@Param(value="factory_id") int factory_id);

}
