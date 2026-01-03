package com.bit.ecommerce.domain;

public class Cart {
	private int cartId;
	private int userId;
	private int productId;
	private int quantity;
	
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Cart(int cartId, int userId, int productId, int quantity) {
		super();
		this.cartId = cartId;
		this.userId = userId;
		this.productId = productId;
		this.quantity = quantity;
	}

	public synchronized int getCartId() {
		return cartId;
	}

	public synchronized void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public synchronized int getUserId() {
		return userId;
	}

	public synchronized void setUserId(int userId) {
		this.userId = userId;
	}

	public synchronized int getProductId() {
		return productId;
	}

	public synchronized void setProductId(int productId) {
		this.productId = productId;
	}

	public synchronized int getQuantity() {
		return quantity;
	}

	public synchronized void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", userId=" + userId + ", productId=" + productId + ", quantity=" + quantity
				+ "]";
	}
}
