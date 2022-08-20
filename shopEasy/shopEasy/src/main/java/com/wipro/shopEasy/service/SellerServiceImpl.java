package com.wipro.shopEasy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.shopEasy.dao.SellerDao;
import com.wipro.shopEasy.model.Seller;

@Service
public class SellerServiceImpl implements SellerService{
	
	@Autowired
	SellerDao sellerDao;

	@Override
	public Seller registerSeller(Seller seller) {
		
		return sellerDao.save(seller);
	}

	@Override
	public Seller getSellerByEmail(String email) {
		
		return sellerDao.findByEmail(email);
	}

	@Override
	public List<Seller> getAllSellers() {
	
		return sellerDao.findAll();
	}

}
