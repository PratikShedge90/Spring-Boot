package com.tca.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
	
//	private Long fkCustId;
	
}
