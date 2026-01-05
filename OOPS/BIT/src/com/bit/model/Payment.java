package com.bit.model;

public class Payment {
	private Integer transactionId;
	private Float amount;
	private String transactedOn;
	private String userId;

	public Payment(Integer transactionId, Float amount, String transactedOn, String userId) {
		this.transactionId = transactionId;
		this.amount = amount;
		this.transactedOn = transactedOn;
		this.userId = userId;
	}
	
	@Override
	public String toString() {
		return this.transactionId + "@" + this.transactedOn + "@" + this.getUserId();
	}

	public Integer getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public String getTransactedOn() {
		return transactedOn;
	}

	public void setTransactedOn(String transactedOn) {
		this.transactedOn = transactedOn;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}