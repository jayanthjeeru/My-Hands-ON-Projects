package com.wipro.h2demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.h2demo.Model.Cart;



@Repository
public interface CartDao extends JpaRepository<Cart,Integer> {

}
