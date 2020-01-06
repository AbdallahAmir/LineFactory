package com.project.demo.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.demo.main.dao.ShiftRepository;
import com.project.demo.main.entity.Shift;

public class ShiftServiceImpli implements ShiftService {
	
	private ShiftRepository shiftRepository;
	
    @Autowired
	public ShiftServiceImpli(ShiftRepository shiftRepository) {
		
		this.shiftRepository = shiftRepository;
	}

	@Override
	public List<Shift> findAll() {
		// TODO Auto-generated method stub
		return shiftRepository.findAll();
	}

	@Override
	public Shift findById(int theId) {
		// TODO Auto-generated method stub
		Optional<Shift> result = shiftRepository.findById(theId);
		 Shift myShift=null;
		 if (result.isPresent()) {
			myShift=result.get();
		}
		return myShift;
	}

	@Override
	public void save(Shift theShift) {
		
		shiftRepository.save(theShift);
	}

	@Override
	public void deleteById(int theId) {
		shiftRepository.deleteById(theId);;

	}

}
