package com.samantha.model;

public class Follower {
	private Integer userId;
	private Integer followerId;

	public Follower(Integer userId, Integer followerId) {
		super();
		this.userId = userId;
		this.followerId = followerId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getFollowerId() {
		return followerId;
	}

	public void setFollowerId(Integer followerId) {
		this.followerId = followerId;
	}
}
