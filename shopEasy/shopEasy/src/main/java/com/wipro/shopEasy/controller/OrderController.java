package com.wipro.shopEasy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.wipro.shopEasy.model.UserOrders;
import com.wipro.shopEasy.service.OrdersService;

@RestController
@RequestMapping("order")
@CrossOrigin
public class OrderController {
	@Autowired
	OrdersService orderService;
	
	@PostMapping("addorder")
	public List<UserOrders> addOrder(@RequestBody List<UserOrders> orders){
		
		return orderService.addOrder(orders);
		
	}
	
	@PostMapping("addoneorder")
	public UserOrders addOneOrder(@RequestBody UserOrders order){
		
		return orderService.saveOneOrder(order);
		
	}
	
	@GetMapping("getordersbyinstance")
	public List<List<UserOrders>> getOrdersByInstance(@RequestParam String username){
		
		return orderService.getOrdersByInstance(username);
		
	}
	
	@GetMapping("getordersbysellername")
	public List<UserOrders> getOrdersBySellerName(@RequestParam String sellerName){
		
		return orderService.getOrdersBySellername(sellerName);
		
	}
	
	@PostMapping("updateorder")
	public UserOrders updateOrder(@RequestBody UserOrders order){
		
		return orderService.updateOrder(order);
		
	}
}
