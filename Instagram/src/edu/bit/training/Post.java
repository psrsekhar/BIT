package edu.bit.training;

public class Post {
	private Integer id;
	private String userName;
	private String postType;
	private String postedOn;
	private String message;
	
	public Post(Integer id, String userName, String postType, String postedOn, String message) {
		this.id = id;
		this.userName = userName;
		this.postType = postType;
		this.postedOn = postedOn;
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "Post [id=" + id + ", userName=" + userName + ", postType=" + postType + ", postedOn=" + postedOn
				+ ", message=" + message + "]";
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPostType() {
		return postType;
	}
	public void setPostType(String postType) {
		this.postType = postType;
	}
	public String getPostedOn() {
		return postedOn;
	}
	public void setPostedOn(String postedOn) {
		this.postedOn = postedOn;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
