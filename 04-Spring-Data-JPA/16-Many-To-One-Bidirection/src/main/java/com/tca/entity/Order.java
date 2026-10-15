package com.tca.entity;

import java.time.LocalDate;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Orders")
@Entity
public class Order 
{
	@Id
	private Long orderId;
	
	private LocalDate datePurchased;
	
	@Column(name="status")
	@Enumerated(EnumType.STRING)
	private OrderStatus orderStatus;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch= FetchType.EAGER)
	@JoinColumn(name="cust_id")
	private Customer customer;

}
