package edu.bit.training;

import java.util.List;

public class Instagram {
	public static void main(String[] a) {
		PostService ps = new PostServiceImpl();
		CommentService cs = new CommentServiceImpl();
		List<Post> posts = ps.getAllPosts();
		List<Comment> comments = null;
		
		for(Post post: posts) {
			comments = cs.getCommentByPostId(post.getId());
			for(Comment comment : comments) {
				System.out.println("User: " + post.getUserName() + "\tMessage: " + post.getMessage());
				System.out.println("-------------Comments--------------------");
				System.out.println("User: " + comment.getUserName() + "\tComment: " + comment.getComment());
				System.out.println("---------------------------------------------------");
			}
		}

		MySqlManager.closeConnection();
		posts = ps.getAllPosts();
	}
}
