package edu.bit.oops.payment;

public class Order {
	private String id;
	private String userId;
	private Integer productId;
	private Integer addressId;

	public Order(String id, String userId, Integer productId, Integer addressId) {
		super();
		this.id = id;
		this.userId = userId;
		this.productId = productId;
		this.addressId = addressId;
	}
	
	@Override
	public String toString() {
		return "Order {id:" + this.id + ", userId:" + this.userId + ", productId:" + this.productId + ", addressId:"
				+ this.addressId + "}";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

    //get and set methods for instance variables
	
}
