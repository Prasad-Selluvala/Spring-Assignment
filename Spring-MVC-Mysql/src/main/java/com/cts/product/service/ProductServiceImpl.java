package com.cts.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.product.dao.ProductDao;
import com.cts.product.entity.Product;

@Service
public class ProductServiceImpl implements ProductService{

	
	@Autowired
	private ProductDao prodDao;
	
	@Override
	@Transactional
	public List<Product> viewProducts() {
		return prodDao.viewProducts();
	}


	@Override
	@Transactional
	public void saveProducts(Product prod) {
		prodDao.saveProducts(prod);
		
	}
}




