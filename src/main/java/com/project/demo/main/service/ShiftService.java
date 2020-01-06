package com.project.demo.main.service;

import java.util.List;

import com.project.demo.main.entity.Shift;

public interface ShiftService {
	public List<Shift> findAll();
	public Shift findById(int theId);
	public void  save(Shift theShift);
	public void deleteById(int theId);

}
