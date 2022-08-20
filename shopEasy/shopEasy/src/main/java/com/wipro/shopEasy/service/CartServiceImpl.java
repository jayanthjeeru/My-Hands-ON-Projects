package com.wipro.shopEasy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.shopEasy.dao.CartDao;
import com.wipro.shopEasy.model.Cart;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartDao cartDao;
	
	@Override
	public Cart addToCart(Cart cart) {
	
		return cartDao.save(cart);
	}
	
	@Override
	public Cart updateCartProduct(Cart cart) {

		return cartDao.save(cart);
	}

	@Override
	public List<Cart> getAllItemsInCart() {
		
		return cartDao.findAll();
	}

	@Override
	public Float getCartPriceByUsername(String username) {
		
		return cartDao.getCartPrice(username);
	}

	@Override
	public String deleteCartItemsByUsername(String username) {

		//cartDao.deleteCartItemsByUsername(username);
		//cartDao.deleteByUsername(username);
		cartDao.deleteAll(cartDao.findByUsername(username));
	
		return "cart items of user "+username+ " deleted successful";
	}

	@Override
	public String deleteCartItem(Cart cart) {
	
		cartDao.delete(cart);
		return "Item Deleted Successfully";
	}

	@Override
	public List<Cart> getItemsInCartByUserId(int userId) {
		
		return cartDao.findByUserId(userId);
	}

	

}
