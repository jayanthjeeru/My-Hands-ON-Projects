package com.wipro.shopEasy.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wipro.shopEasy.model.Cart;

@Service
public interface CartService {

	public Cart addToCart(Cart cart);
	
	public Cart updateCartProduct(Cart cart);
	
	public List<Cart> getAllItemsInCart();
	
	public Float getCartPriceByUsername(String username);
	
	public String deleteCartItemsByUsername(String username);
	
	public String deleteCartItem(Cart cart);
	
	public List<Cart> getItemsInCartByUserId(int userId);
	
	
	
}
