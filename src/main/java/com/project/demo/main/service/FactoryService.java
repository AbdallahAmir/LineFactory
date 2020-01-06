package com.project.demo.main.service;

import java.util.List;

import com.project.demo.main.entity.Factory;

public interface FactoryService {
	public List<Factory> findAll();
	public Factory findById(int theId);
	public void  save(Factory theFactory);
	public void deleteById(int theId);

}
