package com.bit.model;

public class Order extends Product {
	private Integer orderId;
	private Integer transactionId;
	private String userId;
	private Float amount;
	private Integer productId;

	public Order(Integer productId, String name, String brand, String price, Integer orderId, Integer transactionId, String userId, Float amount) {
		super(productId, name, brand, price);
		this.orderId = orderId;
		this.transactionId = transactionId;
		this.userId = userId;
		this.amount = amount;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}
}
