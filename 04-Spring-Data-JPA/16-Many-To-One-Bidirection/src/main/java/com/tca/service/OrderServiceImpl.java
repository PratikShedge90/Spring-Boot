package com.tca.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tca.entity.Customer;
import com.tca.entity.Order;
import com.tca.repository.OrderRepository;

@Service("orderService")
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderRepository orderReposiotry;

	@Override
	public Order fetchOrderById(Long oid) {

		return orderReposiotry.findById(oid).get();
	}

	@Override
	public Order updateOrderStatus(Order order) 
	{
		return orderReposiotry.save(order);
		
	}

	@Override
	public Order saveOrder(Order order, Customer customer) {
		
		order.setCustomer(customer);
		return orderReposiotry.save(order);
	}

}
