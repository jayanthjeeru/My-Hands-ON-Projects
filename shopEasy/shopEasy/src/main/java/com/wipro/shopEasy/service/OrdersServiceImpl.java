package com.wipro.shopEasy.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.shopEasy.dao.OrdersDao;
import com.wipro.shopEasy.model.UserOrders;
@Service
public class OrdersServiceImpl implements OrdersService {

	@Autowired
	private OrdersDao ordersDao;
	@Override
	public List<UserOrders> addOrder(List<UserOrders> orders) {
		
		return ordersDao.saveAll(orders);
	}
	@Override
	public UserOrders saveOneOrder(UserOrders order) {
	
		return ordersDao.save(order);
	}
	@Override
	public List<List<UserOrders>> getOrdersByInstance(String username) {
		
		//<String,List<UserOrders>> orders = new HashMap<>();
		
		List<List<UserOrders>> instorders = new ArrayList<>();
		
		List<String> referenceId  = ordersDao.getOrdersByInstance(username);
		
		List<UserOrders> allOrders = ordersDao.findByUsername(username);
		
//		System.out.println(referenceId);
//		System.out.println(allOrders);
		
	
		
		for(int i=0;i<referenceId.size();i++) {
			//temp.clear();
			List<UserOrders> temp =new ArrayList<>();
			for(UserOrders j : allOrders) {
//				System.out.println(j.getUniqueOrderId()+" "+referenceId.get(i));
//				System.out.println(j.getUniqueOrderId().getClass());
//				System.out.println(referenceId.get(i).getClass());
				if(j.getUniqueOrderId().contentEquals(referenceId.get(i))) {
					temp.add(j);
					//allOrders.remove(j);
				}
				
			}
			//orders.put(referenceId.get(i), temp);
//			for(UserOrders k:temp) {
//				System.out.println(k.getOrderId());
//			}
			//System.out.println("...............");
			//System.out.println(temp);
			instorders.add(temp);
		
			//System.out.println(instorders);
			//temp.clear();
			
			
		}
		
		//System.out.println(orders.values());
		
		return instorders;
	}
	@Override
	public List<UserOrders> getOrdersBySellername(String sellerName) {
		// TODO Auto-generated method stub
		return ordersDao.findBySellerName(sellerName);
	}
	@Override
	public UserOrders updateOrder(UserOrders order) {
	
		return ordersDao.save(order);
	}

}
