package com.wipro.CartService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.CartService.Model.Cart;
import com.wipro.CartService.Service.CartService;

@RestController
@RequestMapping("cart")
public class CartController {

	@Autowired
	private CartService cartservice;
	
	@GetMapping("getall")
	public List<Cart> getall(){
		
		return cartservice.getall();
	}
	
	@PostMapping("setitem")
	public Cart setItem(@RequestBody Cart cart) {
		return cartservice.setItem(cart);
	}
}
