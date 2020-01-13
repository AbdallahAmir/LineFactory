package com.project.demo.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.demo.main.dao.ProductRepositiory;
import com.project.demo.main.entity.Product;

public class ProductServices {
	 @Autowired
	private ProductRepositiory productRepository;
	
   
	
	
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}


	public Product findById(int theId) {
		// TODO Auto-generated method stub
		Optional<Product> result = productRepository.findById(theId);
		 Product myProduct=null;
		 if (result.isPresent()) {
			myProduct=result.get();
		}
		return myProduct;
	}

	
	public void save(Product theProduct) {
		
		productRepository.save(theProduct);
	}


	public void deleteById(int theId) {
		productRepository.deleteById(theId);;

	}

}
