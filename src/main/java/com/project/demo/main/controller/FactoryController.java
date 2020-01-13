package com.project.demo.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.demo.main.entity.Factory;
import com.project.demo.main.service.FactoryServices;
 
@CrossOrigin
@RequestMapping(value="/factory")
@RestController
public class FactoryController {
	
	  @Autowired
	  private FactoryServices FactoryServices;
	  
	  @PutMapping(value = "/update/{id}")
	  public void updateShift(@RequestBody Factory factory ,@PathVariable int id) {
		  FactoryServices.update(factory.getFactory_name(), factory.getBuildings(),
	  factory.getFloors(),factory.getIndustry(),factory.getLocation(),factory.getOwnerName(),id); }
	  
	  
	  @RequestMapping(value = "/all")
	  public List<Factory> findAll(){
		  
		  return FactoryServices.findAll();
	  }
	  
	  @GetMapping("/{theId}")
	 public Factory findById(@PathVariable int theId) {
		 return FactoryServices.findById(theId);
	 }

}
