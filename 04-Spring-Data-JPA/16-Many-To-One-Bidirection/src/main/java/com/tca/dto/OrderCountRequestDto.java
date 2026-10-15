package com.tca.dto;

import com.tca.entity.OrderStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderCountRequestDto {

	private String name;
	private OrderStatus orderStatus;
}
