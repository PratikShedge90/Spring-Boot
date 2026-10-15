package com.tca.service;

import com.tca.entity.Customer;
import com.tca.entity.Order;

public interface OrderService {
	
	public Order fetchOrderById(Long oid);
	
	public Order updateOrderStatus(Order order);		// 101 | 2026-09-22 | ORDERED  |  1 
	
	public Order saveOrder(Order order, Customer customer);
	
	// Delete Order But Customer Should not be Deleted

}
