package com.wipro.shopEasy.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wipro.shopEasy.model.Cart;

@Repository
public interface CartDao extends JpaRepository<Cart, Integer>{
	
	@Query("select sum(c.price*c.quantity) from Cart c where c.username=:username group by username")
	public Float getCartPrice(@Param("username") String username);
	
	@Modifying
	@Query("delete from Cart c where c.username=:username")
	public void deleteCartItemsByUsername(@Param("username") String username);
	
	public void deleteByUsername(String username);
	
	public List<Cart> findByUsername(String username);
	
	public List<Cart> findByUserId(int userId);
	

}
