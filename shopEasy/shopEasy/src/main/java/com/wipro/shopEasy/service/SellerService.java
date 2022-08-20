package com.wipro.shopEasy.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wipro.shopEasy.model.Seller;
import com.wipro.shopEasy.model.User;

@Service
public interface SellerService {
	
	public Seller registerSeller(Seller seller);
	
	public Seller getSellerByEmail(String email);
	
	public List<Seller> getAllSellers();

}
