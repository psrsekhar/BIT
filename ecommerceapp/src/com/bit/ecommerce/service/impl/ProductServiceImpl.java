package com.bit.ecommerce.service.impl;

import java.util.List;

import com.bit.ecommerce.dao.ProductDao;
import com.bit.ecommerce.dao.impl.ProductDaoImpl;
import com.bit.ecommerce.domain.Product;
import com.bit.ecommerce.service.ProductService;

public class ProductServiceImpl implements ProductService {

	ProductDao productDao = new ProductDaoImpl();
	
	@Override
	public List<Product> getProducts() {
		return productDao.getAll();
	}

}
