package com.samantha.model;

public class UserAccount {
	private Integer userId;
	private String userName;
	private Integer pin;

	public UserAccount(Integer userId, String userName, Integer pin) {
		this.userId = userId;
		this.userName = userName;
		this.pin = pin;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getPin() {
		return pin;
	}

	public void setPin(Integer pin) {
		this.pin = pin;
	}

}
