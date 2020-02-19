package com.cts.product.dao;

import java.util.List;

import com.cts.product.entity.Product;

public interface ProductDao {

	void saveProducts(Product prod);

	List<Product> viewProducts();

}