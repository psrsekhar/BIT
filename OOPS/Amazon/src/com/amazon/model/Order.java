package com.amazon.model;

public class Order {
	private Integer orderId;
	private Integer customerId;
	private Float price;

	public Order(Integer orderId, Integer customerId, Float price) {
		this.orderId = orderId;
		this.customerId = customerId;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customerId=" + customerId + ", price=" + price + "]";
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}
}
