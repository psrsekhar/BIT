package com.bit.ecommerce.controller;

import java.util.List;

import com.bit.ecommerce.domain.Product;
import com.bit.ecommerce.service.ProductService;
import com.bit.ecommerce.service.impl.ProductServiceImpl;

public class ProductController {
	ProductService productService = new ProductServiceImpl();
	
	public List<Product> getProducts() {
		return productService.getProducts();
	}
}
