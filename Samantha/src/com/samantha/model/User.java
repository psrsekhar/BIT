package com.samantha.model;

public class User {
	private Integer id;
	private String name;
	private String email;
	private String createdOn;
	private UserAccount userAccount;

	public User(Integer id, String name, String email, String createdOn) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.createdOn = createdOn;
	}
	
	public User(Integer id, String name, String email, String createdOn, UserAccount userAccount) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.createdOn = createdOn;
		this.userAccount = userAccount;
	}

	public UserAccount getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(UserAccount userAccount) {
		this.userAccount = userAccount;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}
}
