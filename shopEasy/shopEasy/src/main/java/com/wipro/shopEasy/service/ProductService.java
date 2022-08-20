package com.wipro.shopEasy.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wipro.shopEasy.model.Product;

@Service
public interface ProductService {
	
	//**************************************Product*******************************************//

	public Product addProduct(Product product);
	
	public Product updateProduct(Product product);
	
	public String deleteProduct(Product product);
	
	public List<Product> getProductByCategory(String category);
	
	public List<Product> getProductLessThanSelectedPrice(float price,String category);
	
	public List<Product> getAllProducts();
	

	
	
	
}
