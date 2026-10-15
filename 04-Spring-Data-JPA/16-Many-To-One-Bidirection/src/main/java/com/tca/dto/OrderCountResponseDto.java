package com.tca.dto;

import com.tca.entity.OrderStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderCountResponseDto {

	private String name;
	private OrderStatus orderStatus;
	private Long count;
}
