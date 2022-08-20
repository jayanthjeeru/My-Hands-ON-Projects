package com.wipro.shopEasy.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wipro.shopEasy.model.UserOrders;

@Repository
public interface OrdersDao extends JpaRepository<UserOrders,Integer>{
	
	//@Query("from UserOrders o where o.username=:username and o.ReferenceId in (select ReferenceId from UserOrders) ")
	@Query("select o.ReferenceId from UserOrders o where o.username=:username group by o.ReferenceId")
	public List<String> getOrdersByInstance(@Param("username") String username);
	
	public List<UserOrders> findBySellerName(String sellerName);
	
	public List<UserOrders> findByUsername(String username);

	
}
