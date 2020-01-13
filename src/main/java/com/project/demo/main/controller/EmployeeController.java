package com.project.demo.main.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.project.demo.main.entity.Employee;

import com.project.demo.main.service.EmployeeServices;
@CrossOrigin
@RestController
@RequestMapping(value="/home")
public class EmployeeController {
	@Autowired
	private EmployeeServices employeeServices;

    @RequestMapping(value="/all")
	public List<Employee> findAll(){
    	
    List<Employee>  emps=employeeServices.findAll();
    	
		return emps;
	}
    
	@GetMapping("find/{employeeId}")
	public Employee getEmployee(@PathVariable int employeeId) {
		
		Employee theEmployee=employeeServices.findById(employeeId);
		if (theEmployee==null) {
			throw new RuntimeException("Employee Id not found"+employeeId);
		}
		
		return theEmployee;
	}

//
//	@RequestMapping(value = "/addEmployee/{department_id}/{shift_id}",method=RequestMethod.POST)	
//	public void addEmployee(@Valid @RequestBody Employee employee, @PathVariable(value = "department_id") int department_id,@PathVariable(value = "shift_id") int shift_id
//	              ) {
//		
//		employeeServices.addEmployee(employee.getEmployee_name(),employee.getEmployee_address(),employee.getContacts(),
//				employee.getSalary(), employee.getImage(),
//				employee.getPassword(),employee.getEmployee_email(),department_id,shift_id);
//	}
	
	@RequestMapping(value = "/addEmployee",method=RequestMethod.POST)	
	public void addEmployee( @RequestBody Employee employee) {
		
		employeeServices.addEmployee(employee);
	}
	
	
	
   @PostMapping(value = "/admin")
	public Employee adminLogin(@RequestBody Employee employee ) {
		
	   Employee theEmployee;
	   
		theEmployee =  employeeServices.adminLogin(employee.getEmployee_email(), employee.getPassword());
		 if(theEmployee == null) {
		    	return null;
		    }else {
		    	return theEmployee;
		    }
	}
   @PostMapping(value = "/manager")
 	public Employee managerLogin(@RequestBody Employee employee ) {
 		
 	   Employee theEmployee;
 	   
 		theEmployee =  employeeServices.managerLogin(employee.getEmployee_email(), employee.getPassword());
 		 if(theEmployee == null) {
 		    	return null;
 		    }else {
 		    	return theEmployee;
 		    }
 	}
   
   
   @GetMapping(value="/select/{department_name}")
   
   public List<String> selectDepartmentEmployees(@PathVariable String department_name){
	   return employeeServices.selectDepartmentEmployees(department_name);
	   
   }
}
