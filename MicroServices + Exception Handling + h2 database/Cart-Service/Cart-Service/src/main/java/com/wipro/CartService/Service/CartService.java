package com.wipro.CartService.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wipro.CartService.Model.Cart;

@Service
public interface CartService {

	public List<Cart> getall();
	
	public Cart setItem(Cart cart);
	
}
