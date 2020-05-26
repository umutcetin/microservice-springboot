package com.eteration.customerservice.service;

import org.springframework.stereotype.Service;

import com.eteration.customerservice.dto.CustomerDTO;

@Service
public class CustomerService {
	public CustomerDTO readCustomer(String id) {
		CustomerDTO customer = new CustomerDTO();
		customer.setId(id);
		customer.setAddress("Bostancı");
		customer.setName("DC");
		customer.setSurname("Y");
		customer.setCardNumber("1234-4545-4545-2325");
		return customer;
	}
}
