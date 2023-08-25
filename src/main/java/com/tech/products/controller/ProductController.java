package com.tech.products.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.tech.products.entity.Products;
import com.tech.products.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService proSer;
	@PostMapping(value="/insertProduct")
	public String setProduct(@RequestBody Products p ) {
		return proSer.setProduct(p);
	}
	@PostMapping(value="/insertListProducts")
	public String setAllProducts(@RequestBody List<Products> q) {
	   return proSer.setAllProducts(q);
	}
	@GetMapping(value = "/getProduct/{id}")
	public Products getProductById(@PathVariable int id) {
		return proSer.getProductById(id);
	}
	@GetMapping(value = "/getProductAll")
	public List<Products> getAllProduct() {
		return proSer.getAllProduct();
	}
	

}
