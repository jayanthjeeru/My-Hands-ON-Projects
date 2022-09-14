package com.wipro.h2demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wipro.h2demo.Model.Cart;



@Service
public interface CartService {

	public List<Cart> getall();
	
	public Cart setItem(Cart cart);
	
}
