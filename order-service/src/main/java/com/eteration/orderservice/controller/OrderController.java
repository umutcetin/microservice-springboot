package com.eteration.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eteration.orderservice.dto.OrderRequestDTO;
import com.eteration.orderservice.dto.OrderResponseDTO;
import com.eteration.orderservice.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping
	public OrderResponseDTO createOrder(@RequestBody OrderRequestDTO orderRequest) {
		return orderService.createOrder(orderRequest);
	}
}
