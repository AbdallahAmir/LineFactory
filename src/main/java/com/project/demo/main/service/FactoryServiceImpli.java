package com.project.demo.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import com.project.demo.main.dao.FactoryRepository;
import com.project.demo.main.entity.Factory;

public class FactoryServiceImpli implements FactoryService {
	
	private FactoryRepository factoryRepository;
	
    @Autowired
	public FactoryServiceImpli(FactoryRepository factoryRepository) {
		
		this.factoryRepository = factoryRepository;
	}

	@Override
	public List<Factory> findAll() {
		// TODO Auto-generated method stub
		return factoryRepository.findAll();
	}

	@Override
	public Factory findById(int theId) {
		// TODO Auto-generated method stub
		Optional<Factory> result = factoryRepository.findById(theId);
		 Factory myFactory=null;
		 if (result.isPresent()) {
			 myFactory=result.get();
		}
		return myFactory;
	}

	@Override
	public void save(Factory theFactory) {
		
		factoryRepository.save(theFactory);
	}

	@Override
	public void deleteById(int theId) {
		factoryRepository.deleteById(theId);;

	}

}
