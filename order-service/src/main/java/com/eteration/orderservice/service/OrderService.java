package com.eteration.orderservice.service;

import java.util.UUID;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import com.eteration.orderservice.dto.OrderRequestDTO;
import com.eteration.orderservice.dto.OrderResponseDTO;

@Service
public class OrderService {

	public OrderResponseDTO createOrder(OrderRequestDTO orderRequest)
	{

		OrderResponseDTO orderResponseDTO = new OrderResponseDTO();
		orderResponseDTO.setOrderId(UUID.randomUUID().toString());
		orderResponseDTO.setMessage("The order that contains (" +
				orderRequest.getCount() + ") products with productID=" +
				orderRequest.getProductId() +
				" belonging to customer with customerID=" +
				orderRequest.getCustomerId()+ " is being prepared !");

		orderResponseDTO.setTotalAmount(Math.random() * 150 + 50);

		return orderResponseDTO;
	}
	
}
