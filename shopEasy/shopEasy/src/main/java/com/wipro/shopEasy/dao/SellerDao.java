package com.wipro.shopEasy.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.shopEasy.model.Seller;
import com.wipro.shopEasy.model.User;

@Repository
public interface SellerDao extends JpaRepository<Seller, Integer> {

	public Seller findByEmail(String email);  
}
