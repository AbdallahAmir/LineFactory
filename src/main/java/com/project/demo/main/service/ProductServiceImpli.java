package com.project.demo.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.demo.main.dao.ProductRepositiory;
import com.project.demo.main.entity.Product;

public class ProductServiceImpli implements ProductService {
	
	private ProductRepositiory productRepository;
	
    @Autowired
	public ProductServiceImpli(ProductRepositiory productRepository) {
		
		this.productRepository = productRepository;
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public Product findById(int theId) {
		// TODO Auto-generated method stub
		Optional<Product> result = productRepository.findById(theId);
		 Product myProduct=null;
		 if (result.isPresent()) {
			myProduct=result.get();
		}
		return myProduct;
	}

	@Override
	public void save(Product theProduct) {
		
		productRepository.save(theProduct);
	}

	@Override
	public void deleteById(int theId) {
		productRepository.deleteById(theId);;

	}

}
