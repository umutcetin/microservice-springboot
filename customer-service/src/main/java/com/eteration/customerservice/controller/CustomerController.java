package com.eteration.customerservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eteration.customerservice.dto.CustomerDTO;
import com.eteration.customerservice.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/{customerId}")
	public CustomerDTO customerId(@PathVariable("customerId") String id) {
	    return customerService.readCustomer(id);
	}

}
