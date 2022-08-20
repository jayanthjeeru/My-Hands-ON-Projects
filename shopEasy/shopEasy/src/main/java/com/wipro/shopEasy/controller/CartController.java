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

import com.wipro.shopEasy.model.Cart;
import com.wipro.shopEasy.service.CartService;

@RestController
@RequestMapping("cart")
@CrossOrigin
public class CartController {

	@Autowired
	private CartService cartService;
	
	@PostMapping("addtocart")
	public ResponseEntity<Cart> addToCart(@RequestBody Cart cart) {
		
		return new ResponseEntity<Cart>(cartService.addToCart(cart),HttpStatus.OK);
	}
	
	@PutMapping("updatecartproduct")
	public ResponseEntity<Cart> updateCartProduct(@RequestBody Cart cart) {
		
		return new ResponseEntity<Cart>(cartService.updateCartProduct(cart),HttpStatus.ACCEPTED);
	}
	
	@GetMapping("getallitemsincart")
	public ResponseEntity<List<Cart>> getAllItemsInCart(){
		
		return new ResponseEntity<List<Cart>>(cartService.getAllItemsInCart(),HttpStatus.FOUND);
		
	}
	
	@GetMapping("getitemsincartbyuserid")
	public ResponseEntity<List<Cart>> getItemsInCartByUserId(@RequestParam int userId){
		
		return new ResponseEntity<List<Cart>>(cartService.getItemsInCartByUserId(userId),HttpStatus.OK);
		
	}
	
	@GetMapping("getcartprice")
	public ResponseEntity<?> getCartPriceByUsername(@RequestParam String username){
		
		
		if(cartService.getCartPriceByUsername(username)!=null)
			return new ResponseEntity<Float>(cartService.getCartPriceByUsername(username),HttpStatus.OK);
		else
			return new ResponseEntity<String>("No Items In "+username+"'s Cart",HttpStatus.NOT_FOUND);

		
	}
	
	@DeleteMapping("deletecartitems")
	public ResponseEntity<String> deleteCartItemsByUsername(@RequestParam String username){
		
		return new ResponseEntity<String>(cartService.deleteCartItemsByUsername(username),HttpStatus.OK);
	}
	
	@DeleteMapping("deletecartitem")
	public ResponseEntity<String> deleteCartItem(@RequestBody Cart cart){
		
		return new ResponseEntity<String>(cartService.deleteCartItem(cart),HttpStatus.OK);
	}
}
