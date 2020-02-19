package com.cts.product.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="price")
	private double price;
	@Column(name="brand")
	private String brand;
	@Column(name="maiden")
	private String maiden;
	
	private LocalDateTime date;

	private List<String> listProds;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getMaiden() {
		return maiden;
	}

	public void setMaiden(String maiden) {
		this.maiden = maiden;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public List<String> getListProds() {
		return listProds;
	}

	public void setListProds(List<String> listProds) {
		this.listProds = listProds;
	}

	

}
