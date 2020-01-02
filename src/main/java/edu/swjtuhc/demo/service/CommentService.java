package edu.swjtuhc.demo.service;

import java.util.List;

import edu.swjtuhc.demo.model.Comment;

public interface CommentService {
	   void save(Comment comment);

	    List<Comment> list(int pid);
}
