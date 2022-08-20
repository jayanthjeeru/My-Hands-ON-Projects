package com.wipro.shopEasy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cartId;
	private String username;
	private int userId;
	private int productId;
	private String category;
	private String name;
	private String description;
	private float price;
	private int quantity;
	private String sellerName;
	private int sellerId;
	
	
	
	
	public Cart(int cartId, String username, int userId , int productId, String category, String name, String description, float price, int quantity, String sellerName, int sellerId) {
		
		this.cartId = cartId;
		this.username = username;
		this.userId=userId;
		this.productId = productId;
		this.category = category;
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
		this.sellerName=sellerName;
		this.sellerId=sellerId;
	}

	public Cart() {
		
	}
	
	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public int getSellerId() {
		return sellerId;
	}

	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	
	
	

}

