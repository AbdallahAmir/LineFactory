package com.project.demo.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.demo.main.entity.Shift;
import com.project.demo.main.service.ShiftServices;

@CrossOrigin
@RestController
@RequestMapping(value = "/shift")
public class ShiftController {

	@Autowired(required = true)
	private ShiftServices shiftService;

	
	  /*@RequestMapping(value = "/update/{id}") 
	  public void updateShift(@RequestBody Shift shift ,@PathVariable int id) {
	  shiftService.update(shift.getShift_from(), shift.getShift_to(),
	  shift.getWorking_days(),id); }*/
	  
	@GetMapping(value = "/all")
	public List<Shift> findAll() {

		return shiftService.findAll();
	}
	
	@PostMapping(value="/create")
	public void createShift(@RequestBody Shift shift) {
		shiftService.save(shift);
	}

}
