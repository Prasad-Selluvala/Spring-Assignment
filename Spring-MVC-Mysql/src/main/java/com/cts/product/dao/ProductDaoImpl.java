package com.cts.product.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.product.entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SessionFactory sf;
	
	@Override
	public void saveProducts(Product prod) {
		sf.getCurrentSession().save(prod);
		System.out.println("Saved");
	}

	@Override
	public List<Product> viewProducts() {
		Session ses=sf.getCurrentSession();
		Query<Product> qry=ses.createQuery("from Product");
		List<Product> emp=qry.getResultList();
		
		return emp;
		
		 
	}
}
