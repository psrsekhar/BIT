package edu.bit.training;

public class Comment {
	private Integer postId;
	private String userName;
	private String comment;

	public Comment(Integer postId, String userName, String comment) {
		this.postId = postId;
		this.userName = userName;
		this.comment = comment;
	}

	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "Comments [postId=" + postId + ", userName=" + userName + ", comment=" + comment + "]";
	}
}
