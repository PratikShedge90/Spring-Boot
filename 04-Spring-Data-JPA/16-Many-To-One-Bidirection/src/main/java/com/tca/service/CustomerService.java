package com.tca.service;

import java.util.List;

import com.tca.dto.OrderCountResponseDto;
import com.tca.entity.Customer;
import com.tca.entity.OrderStatus;


public interface CustomerService 
{
	public Customer saveCustomer(Customer customer);
	
	public Customer fetchCustomerById(Long id);
	
	

}
