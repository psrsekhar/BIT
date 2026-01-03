package com.bit.ecommerce.domain;

public class User {
	private int userId;
	private String username;
	private String password;
	private String email;
	private String mobile;
	private String role;

	public User() {
		
	}
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", mobile=" + mobile + ", role=" + role + "]";
	}
}
