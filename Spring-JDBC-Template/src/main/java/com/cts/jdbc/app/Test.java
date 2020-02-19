package com.cts.jdbc.app;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.cts.jdbc.config.AppConfig;
import com.cts.jdbc.dao.ProductDao;
import com.cts.jdbc.model.Product;

public class Test {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);

		ProductDao dao=ac.getBean(ProductDao.class);
		
		Product prod1= new Product();
		prod1.setProductId(100);
		prod1.setProductName("Book");
		prod1.setPrice(50);
		dao.saveProduct(prod1);
		
		dao.findAll();
		dao.findById(100);
		dao.deleteById(10);
		dao.editData("Pen", 110);
		List<Product> product1=dao.findByPriceRange(100,200);
		List<Product> product2=dao.findBetweenId(10, 15);
	}
	
}
