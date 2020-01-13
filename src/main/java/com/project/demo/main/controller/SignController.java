package com.project.demo.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.demo.main.entity.Employee;
import com.project.demo.main.entity.Sign;
import com.project.demo.main.service.SignServices;

@CrossOrigin
@RestController
@RequestMapping(value = "/sign")
public class SignController {
	
	
	@Autowired(required = true)
	private SignServices signServices;
	
	  @RequestMapping(value = "/signin/{employee_id}") 
	  public void signin(@PathVariable(value="employee_id") int employee_id) {
	    signServices.signin(employee_id);
		  
	  }
	  
	  @GetMapping("/history/{employee_name}")
		public List<String> selectHistory(@PathVariable(value="employee_name") String employee_name) {
			
			return signServices.selectHistory(employee_name);
		}
	  
	  @PutMapping(value= "/out/{employee_id}")
	  public void update(@PathVariable(value="employee_id") int employee_id) {
			signServices.update(employee_id);
		}
		
	  
	 

	@GetMapping(value = "/all")
	public List<Sign> findAll() {

		return signServices.findall();
	}
	
	

}
