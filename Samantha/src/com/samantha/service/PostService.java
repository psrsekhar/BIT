package com.samantha.service;

import java.util.List;

import com.samantha.model.Post;

public interface PostService {
	public boolean add(Post post);
	public List<Post> viewPosts(Integer userId);
	public List<Post> viewAllPosts(Integer userId);
}
