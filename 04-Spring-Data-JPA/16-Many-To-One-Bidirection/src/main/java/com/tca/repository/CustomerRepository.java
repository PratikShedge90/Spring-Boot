package com.tca.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tca.dto.OrderCountResponseDto;
import com.tca.entity.Customer;
import com.tca.entity.OrderStatus;

public interface CustomerRepository extends JpaRepository<Customer, Long> 
{
	public Optional<Customer> findByName(String name);
	
//	@Query("SELECT c.name, o.orderStatus, count(o.orderStatus) orderDeliverdTillNow from Customer c JOIN Order o ON c.customerId=o.customerId AND c.name = :name AND o.orderStatus= :status GROUP BY c.name, o.orderStatus")

//	@Query("SELECT c.name, o.orderStatus, COUNT(o.orderStatus) FROM Customer c JOIN c.orders o WHERE c.name = :name AND o.orderStatus = :status GROUP BY c.name, o.orderStatus")
//	public OrderCountResponseDto findCustomerOrderCountByStatusAndName(@Param("name") String name,
//																@Param("status") OrderStatus status );
	

	@Query("SELECT new com.tca.dto.OrderCountResponseDto(c.name, o.orderStatus, COUNT(o.orderStatus)) " +
	           "FROM Customer c JOIN c.orders o " +
	           "WHERE c.name = :name AND o.orderStatus = :status " +
	           "GROUP BY c.name, o.orderStatus")
		public OrderCountResponseDto findCustomerOrderCountByStatusAndName(
		        @Param("name") String name,
		        @Param("status") OrderStatus status
		);
	
	
}
