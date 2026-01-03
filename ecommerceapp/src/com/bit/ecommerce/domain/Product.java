package com.bit.ecommerce.domain;

public class Product {
	private int productId;
	private String name;
	private String description;
	private double price;
	private int stockQuantity;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String name, String description, double price, int stockQuantity) {
		super();
		this.productId = productId;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockQuantity = stockQuantity;
	}

	public synchronized int getProductId() {
		return productId;
	}

	public synchronized void setProductId(int productId) {
		this.productId = productId;
	}

	public synchronized String getName() {
		return name;
	}

	public synchronized void setName(String name) {
		this.name = name;
	}

	public synchronized String getDescription() {
		return description;
	}

	public synchronized void setDescription(String description) {
		this.description = description;
	}

	public synchronized double getPrice() {
		return price;
	}

	public synchronized void setPrice(double price) {
		this.price = price;
	}

	public synchronized int getStockQuantity() {
		return stockQuantity;
	}

	public synchronized void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", stockQuantity=" + stockQuantity + "]";
	}
}
