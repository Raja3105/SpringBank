package com.tech.products.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tech.products.entity.Products;

public interface ProductRepository extends JpaRepository <Products,Integer>  {

}
