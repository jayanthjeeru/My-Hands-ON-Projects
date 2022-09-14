package com.wipro.CartService.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.CartService.Model.Cart;

@Repository
public interface CartDao extends JpaRepository<Cart,Integer> {

}
