package com.tca.runner;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
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
	@Override
	public void run(ApplicationArguments args) throws Exception {

		Customer c = new Customer();
		c.setName("YashRaj Londe");
		c.setPhone("99554488232");
		c.setOrders(List.of(new Order(129L,LocalDate.of(2026, 9, 22), OrderStatus.ORDERED),
							new Order(198L,LocalDate.of(2026, 01, 9), OrderStatus.DELIVERED),
							new Order(157L,LocalDate.now(), OrderStatus.CANCELED),
							new Order(133L,LocalDate.now(), OrderStatus.PROCESSED)
							));
		
		Customer cusresp = customerService.saveCustomer(c);
		System.out.println(cusresp);
		

		/** Use Case 3: Customer Should be Saved Without Order Independent */
/*		
		Customer cus = new Customer();
		cus.setName("Bhushan Deshmukh");
		cus.setPhone("8893372919");
		
		Customer cusResp = customerService.saveCustomer(cus);
		System.out.println(cusResp.getCustomerId());
*/
//		Customer cus = customerService.fetchCustomerById(7L);
//		cus.setOrders(List.of(new Order(999L,LocalDate.now(),OrderStatus.ORDERED)));
//		
//		customerService.saveCustomer(cus);
		
//		
//		
//		OrderCountRequestDto req = new OrderCountRequestDto();
//		req.setName("Pratik Shedge");
//		req.setOrderStatus(OrderStatus.DELIVERED);
//		
//		Customer c = new Customer();
//		c.setName(req.getName());
//		
//		Order o = new Order();
//		o.setOrderStatus(req.getOrderStatus());
//		
//		OrderCountResponseDto list = customerService.findCustomerOrderByNameAndStatus(c.getName(), o.getOrderStatus());
//		
//		System.out.print(list);
			
		
		/** Use Case 4: delete Customer By CustomerId */
/*		customerService.deleteCustomerById(3L);					*/
		
		/** Use Case 5: update Status of Order like ORDERED-To-CANCELLED */
	/*	
		Order order = orderService.fetchOrderById(101L);		//  101 | 2026-09-22 | ORDERED |  1 
		order.setOrderStatus(OrderStatus.CANCELED);
		
		Order orderResp = orderService.updateOrderStatus(order); //  101 | 2026-09-22 | CANCELED |  1
		System.out.println(orderResp);
	*/
		
		/** Caching of Object to Keep consistency  */
/*		Customer c = customerService.fetchCustomerById(1L);
		c.setName("Pratik Shedge");	 						// Customer Name is Updated at database side too
		System.out.println(c);
*/
		
/*				
		Customer c = customerService.fetchCustomerById(1L);
		
		List<Order> orders = c.getOrders();
		orders.add(new Order(888L, LocalDate.now(), OrderStatus.PROCESSED));
		c.setOrders(orders);
		customerService.saveCustomer(c);
		
		System.out.println("Order is Added for Customer with ID : " + c.getCustomerId());
*/
		
		/** Orphan Concept*/
/*		Customer c  = customerService.fetchCustomerById(4L);
		c.getOrders().remove(0);	
*/		
		
		
	}

}
