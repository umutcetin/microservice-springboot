package com.eteration.productservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eteration.productservice.dto.ProductDTO;
import com.eteration.productservice.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductServiceController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/{productId}")
	public ProductDTO readProduct(@PathVariable("productId") String productId) {
		return productService.readProduct(productId);
	}
}
