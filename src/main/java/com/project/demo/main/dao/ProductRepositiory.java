package com.project.demo.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.demo.main.entity.Product;

public interface ProductRepositiory extends JpaRepository<Product, Integer>{

}
