package com.wipro.shopEasy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.shopEasy.dao.ProductDao;
import com.wipro.shopEasy.model.Product;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao productDao;

	@Override
	public Product addProduct(Product product) {
		
		return productDao.save(product);
		
		
	}
	
	@Override
	public Product updateProduct(Product product) {
		
		return productDao.save(product);
		
	}
	
	@Override
	public String deleteProduct(Product product) {
		
		 productDao.delete(product);
		 return "Product Deleted Successful";
	}

	@Override
	public List<Product> getAllProducts() {
		
		return productDao.findAll();
	}

	@Override
	public List<Product> getProductByCategory(String category) {
	
		return productDao.findByCategory(category);
	}

	@Override
	public List<Product> getProductLessThanSelectedPrice(float price,String category) {
	
		return productDao.getProductsLessThanSelectedPrice(price,category);
	}

	

}
