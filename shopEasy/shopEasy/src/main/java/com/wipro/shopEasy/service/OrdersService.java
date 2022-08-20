package com.wipro.shopEasy.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.wipro.shopEasy.model.UserOrders;

@Service
public interface OrdersService {
	
	public List<UserOrders> addOrder(List<UserOrders> orders);
	
	public UserOrders saveOneOrder(UserOrders order);
	
	public List<List<UserOrders>> getOrdersByInstance(String username);
	
	public List<UserOrders> getOrdersBySellername(String sellerName);
	
	public UserOrders updateOrder(UserOrders order);

}
