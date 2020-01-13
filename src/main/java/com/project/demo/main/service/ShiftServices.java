package com.project.demo.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.demo.main.dao.ShiftRepository;
import com.project.demo.main.entity.Shift;
@Service
public class ShiftServices  {
	
	
@Autowired
private ShiftRepository shiftRepository;
	
   
	
	
	  public List<Shift> findAll() { // TODO Auto-generated method stub 
		  
		  return shiftRepository.findAll(); }
	  
	  
	  public Shift findById(int theId) { // TODO Auto-generated method stub
	  Optional<Shift> result = shiftRepository.findById(theId); Shift myShift=null;
	  if (result.isPresent()) { myShift=result.get(); } return myShift; }
	 
	  
	  public void deleteById(int theId) { shiftRepository.deleteById(theId);;
	  
	  }
	 
	
	public void update(int from, int to, int Working_days, int shiftid) {
		shiftRepository.updateShift( from, to, Working_days,shiftid);
		
	}
	
	public void save(Shift shift) {
		shiftRepository.save(shift);
	}

	/*
	 * @Override public void update( int from, int to, int Working_days,int shiftid)
	 * { shiftRepository.updateShift( from, to, Working_days,shiftid);
	 * 
	 * }
	 */

	/*
	 * @Override public void update(int shift_id,int from) {
	 * shiftRepository.update(shift_id, from); }
	 */

}
