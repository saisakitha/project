package com.hexaware.onlinegrocerydelivery.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.onlinegrocerydelivery.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	List<Product> getByCategory(String category);
	
	List<Product> getByBrand(String brand);
	
	List<Product> getByProductName(String productName);
}
