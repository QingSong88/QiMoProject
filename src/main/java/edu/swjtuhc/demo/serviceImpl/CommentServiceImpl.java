package edu.swjtuhc.demo.serviceImpl;

import edu.swjtuhc.demo.mapper.CommentMapper;
import edu.swjtuhc.demo.model.Comment;
import edu.swjtuhc.demo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public void save(Comment comment) {
        commentMapper.save(comment);
    }

    @Override
    public List<Comment> list(int pid) {
        return commentMapper.list(pid);
    }
}
