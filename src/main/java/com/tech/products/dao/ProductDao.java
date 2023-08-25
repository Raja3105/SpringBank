package com.tech.products.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tech.products.entity.Products;
import com.tech.products.repository.ProductRepository;

@Repository
public class ProductDao {
	@Autowired
	ProductRepository proRepo;
	
	public String setProduct(Products p) {
		  proRepo.save(p);
		return "Successfully Saved";
		
	}
	public String setAllProducts(List<Products> q) {
		  proRepo.saveAll(q);
		return "Successfully Saved";
		
	}
	public Products getProductById(int id) {
		  return proRepo.findById(id).get();
				
	}
	public List<Products> getAllProduct() {
		  return proRepo.findAll();
				
	}
	
	

}
