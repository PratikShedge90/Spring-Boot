package com.tca.service;

import java.util.List;

import com.tca.dto.OrderCountResponseDto;
import com.tca.entity.Customer;
import com.tca.entity.OrderStatus;


public interface CustomerService 
{
	public Customer saveCustomer(Customer customer);
	
	public OrderCountResponseDto findCustomerOrderByNameAndStatus(String name, OrderStatus status);
	
	public Customer fetchCustomerById(Long id);
	
	public void deleteCustomerById(Long cid);

}
