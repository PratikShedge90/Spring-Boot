package com.tca.runner;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.tca.entity.Customer;
import com.tca.entity.Order;
import com.tca.entity.OrderStatus;
import com.tca.service.CustomerService;
import com.tca.service.OrderService;


@Component
public class MyRunner implements ApplicationRunner {

	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private OrderService orderService;


	@Transactional
	@Modifying
	@Override
	public void run(ApplicationArguments args) throws Exception 
	{
		
/*		Order o1 = new Order();
		o1.setOrderId(103L);
		o1.setDatePurchased(LocalDate.now());
		o1.setOrderStatus(OrderStatus.DELIVERED);
		
		Order o2 = new Order();
		o2.setOrderId(104L);
		o2.setDatePurchased(LocalDate.now());
		o2.setOrderStatus(OrderStatus.ORDERED);
		
		Customer c = new Customer();
		c.setName("Saurav");
		c.setPhone("8888");
		
		c.setOrders(List.of(o1,o2));
		
		o1.setCustomer(c);
		o2.setCustomer(c);
		
		c = customerService.saveCustomer(c);
		System.out.println("Data is Saved for Customer ID : " +c.getCustomerId());
*/
		
/*		
		Customer c = new Customer();
		c.setName("Aniket");
		c.setPhone("777777");
		
		Order o1 = new Order();
		o1.setOrderId(105L);
		o1.setDatePurchased(LocalDate.now());
		o1.setOrderStatus(OrderStatus.DELIVERED);
		
		orderService.saveOrder(o1, c);
		
		Order o2 = new Order();
		o2.setOrderId(106L);
		o2.setDatePurchased(LocalDate.now());
		o2.setOrderStatus(OrderStatus.ORDERED);
		
		orderService.saveOrder(o2, c);
		
		System.out.println("order are Saved !!");
*/
		
		/** Test Case 3: Save Order for Customer who is Already Present in DB**/
		
//		Customer c = new Customer();
//		c.setName("Raj Sanap");
//		c.setPhone("9999999");
//		customerService.saveCustomer(c);
/*		
		Customer c = customerService.fetchCustomerById(1L);
		
		Order o1 = new Order();
		o1.setOrderId(105L);
		o1.setDatePurchased(LocalDate.now());
		o1.setOrderStatus(OrderStatus.DELIVERED);
		
		orderService.saveOrder(o1, c);
		
		Order o2 = new Order();
		o2.setOrderId(106L);
		o2.setDatePurchased(LocalDate.now());
		o2.setOrderStatus(OrderStatus.ORDERED);
		
		orderService.saveOrder(o2, c);
*/
		/** Test Case 4: Fetch Orders for Existing Customer */
		
		Customer c = customerService.fetchCustomerById(1L);
		System.out.println("Customer ID 	: " + c.getCustomerId());
		System.out.println("Customer Name 	: " + c.getName());
		System.out.println("Customer Phone	: " + c.getPhone());
		
		System.out.println("---------------------------------------------");
		
		List<Order> orders = c.getOrders();
		
		for(Order o : orders)
		{
			System.out.println("Order Id 		: " + o.getOrderId());
			System.out.println("Order Date 		: " + o.getDatePurchased());
			System.out.println("Order Status 	: " + o.getOrderStatus());
		}
		
		
		
		
	}

}
