package com.tca.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tca.dto.OrderCountResponseDto;
import com.tca.entity.Customer;
import com.tca.entity.OrderStatus;
import com.tca.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepositiory;
	
	public CustomerServiceImpl(CustomerRepository customerRepository)
	{
		this.customerRepositiory=customerRepository;
	}
	
	@Override
	public Customer saveCustomer(Customer customer) 
	{
/*		Optional<Customer> cusPresent = customerRepositiory.findByName(customer.getName());
		
		if(cusPresent.isPresent()) {
			System.out.println("Customer Already Present Adding Order's in Order Table ");
			return cusPresent.get();
			
		}else {
			System.out.println("Customer Not Present I am Creating a new Customer");
			return customerRepositiory.save(customer);
		}
*/		
		return customerRepositiory.save(customer);
	}

	@Override
	public OrderCountResponseDto findCustomerOrderByNameAndStatus(String name, OrderStatus status) 
	{
		return customerRepositiory.findCustomerOrderCountByStatusAndName(name, status);
	}
	
	@Override
	public Customer fetchCustomerById(Long id)
	{
		Optional<Customer> c = customerRepositiory.findById(id);
		
		if(c.isPresent()) {
			return c.get();
		}
		else {
			return null;
		}
//		return customerRepositiory.findById(id).get();
	}

	
	@Override
	public void deleteCustomerById(Long cid) 
	{	
		if(cid !=null) 
		{
			customerRepositiory.deleteById(cid);
		}else {
			return;
		}
	}
	

}
