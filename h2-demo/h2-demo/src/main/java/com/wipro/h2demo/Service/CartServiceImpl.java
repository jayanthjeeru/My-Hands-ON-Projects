package com.wipro.h2demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.h2demo.Dao.CartDao;
import com.wipro.h2demo.Model.Cart;



@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartDao cartdao;
	
	@Override
	public List<Cart> getall() {
		// TODO Auto-generated method stub
		return cartdao.findAll();
	}

	

	@Override
	public Cart setItem(Cart cart) {
		// TODO Auto-generated method stub
		return cartdao.save(cart);
	}

}
