package edu.bit.training;

import java.util.List;

public interface CommentService {
	public List<Comment> getCommentByPostId(Integer postId);
}
