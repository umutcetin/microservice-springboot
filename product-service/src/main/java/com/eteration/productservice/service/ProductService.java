package com.eteration.productservice.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.eteration.productservice.dto.ProductDTO;

@Service
public class ProductService {
	
	@Value("${kdv}")
	private int kdv;
	
	public ProductDTO readProduct(@PathVariable("productId") String productId) {
		ProductDTO product = new ProductDTO();
		product.setProductId(productId);
		product.setName("Product" + productId);
		product.setPrice(Math.random() * 100 * kdv);
		return product;
	}

}
