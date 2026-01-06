package com.bit.model;

public class Product {
	private Integer productId;
	private String name;
	private String brand;
	private String price;

	public Product(Integer productId, String name, String brand, String price) {
		this.productId = productId;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
}
