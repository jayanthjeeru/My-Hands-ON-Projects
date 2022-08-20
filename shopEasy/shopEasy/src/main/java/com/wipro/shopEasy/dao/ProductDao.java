package com.wipro.shopEasy.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wipro.shopEasy.model.Product;

@Repository
public interface ProductDao extends JpaRepository<Product,Integer>{

	public List<Product> findByCategory(String category);
	
	@Query("FROM Product p WHERE p.price<=:price and p.category=:category")
	public List<Product> getProductsLessThanSelectedPrice(@Param("price") float price,@Param("category") String category);
}
