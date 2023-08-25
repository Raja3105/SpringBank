package com.tech.products.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.tech.products.dao.ProductDao;
import com.tech.products.entity.Products;

@Service
public class ProductService {
	@Autowired
	ProductDao proDao;
	
	public String setProduct(Products p) {
		return proDao.setProduct(p);
		
	}
	public String setAllProducts(List<Products> q) {
		return proDao.setAllProducts(q);
	}
	public Products getProductById(int id) {
		return proDao.getProductById(id);
	}
	public List<Products> getAllProduct() {
		return proDao.getAllProduct();
	}
}
