package com.project.demo.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.demo.main.dao.FactoryRepository;
import com.project.demo.main.entity.Factory;
@Service
public class FactoryServices {
	
	@Autowired
	private FactoryRepository factoryRepository;
	
    
	public FactoryServices(FactoryRepository factoryRepository) {
		
		this.factoryRepository = factoryRepository;
	}

	
	public List<Factory> findAll() {
		// TODO Auto-generated method stub
		return factoryRepository.findAll();
	}
	public void update(String factory_name,int buildings,int floors,String industry,String location,String owenrname,int factory_id) {
		factoryRepository.updateFactory(factory_name, buildings, floors, industry, location, owenrname, factory_id);;
		
	}

	
	public Factory findById(int theId) {
		// TODO Auto-generated method stub
		Optional<Factory> result = factoryRepository.findById(theId);
		 Factory myFactory=null;
		 if (result.isPresent()) {
			 myFactory=result.get();
		}
		return myFactory;
	}

	
	public void save(Factory theFactory) {
		
		factoryRepository.save(theFactory);
	}

	
	public void deleteById(int theId) {
		factoryRepository.deleteById(theId);;

	}

	
	public void update(int theId) {
		// TODO Auto-generated method stub
		
	}

}
