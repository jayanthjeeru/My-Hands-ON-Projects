package com.wipro.shopEasy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sun.net.httpserver.HttpExchange;
import com.wipro.shopEasy.model.Product;
import com.wipro.shopEasy.service.ProductService;

@RestController
@RequestMapping("product")
@CrossOrigin
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping("addproduct")
	public ResponseEntity<Product> addProduct(@RequestBody Product product) {
		
		return new ResponseEntity<Product>(productService.addProduct(product),HttpStatus.CREATED) ;
	}
	
	@PutMapping("updateproduct")
	public ResponseEntity<Product> updateProduct(@RequestBody Product product) {
		
		return new ResponseEntity<Product>(productService.updateProduct(product),HttpStatus.ACCEPTED) ;
	}
	
	@DeleteMapping("deleteproduct")
	public ResponseEntity<String> deleteProduct(@RequestBody Product product) {
		
		return new ResponseEntity<String>(productService.deleteProduct(product),HttpStatus.OK) ;
	}
	
	@GetMapping("getallproducts")
	public ResponseEntity<List<Product>>  getProducts() {
		
		return new ResponseEntity<List<Product>>(productService.getAllProducts(),HttpStatus.OK) ;
	}
	
	@GetMapping("getproductsbycategory")
	public ResponseEntity<List<Product>>  getProductsByCategory(@RequestParam String category) {
		
		return new ResponseEntity<List<Product>>(productService.getProductByCategory(category),HttpStatus.FOUND) ;
	}
	
	@GetMapping("getproductslessthanselectedprice")
	public ResponseEntity<List<Product>>  getProductLessThanSelectedPrice(@RequestParam float price,@RequestParam String category) {
		
		return new ResponseEntity<List<Product>>(productService.getProductLessThanSelectedPrice(price,category),HttpStatus.FOUND) ;
	}
}
