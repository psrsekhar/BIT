package com.samantha.model;

public class Post {
	private Integer userId;
	private String message;
	private String postedOn;

	public Post(Integer userId, String message, String postedOn) {
		this.userId = userId;
		this.message = message;
		this.postedOn = postedOn;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPostedOn() {
		return postedOn;
	}

	public void setPostedOn(String postedOn) {
		this.postedOn = postedOn;
	}
}
