package com.cts.product.service;

import java.util.List;

import com.cts.product.entity.Product;

public interface ProductService {

	void saveProducts(Product prod);
	
	List<Product> viewProducts();

}