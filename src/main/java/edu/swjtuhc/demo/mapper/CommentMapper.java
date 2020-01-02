package edu.swjtuhc.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Comment;

@Mapper
public interface CommentMapper {
    /**
     * 保存评论
     */
    void save(Comment comment);

    /**
     * 根据商品id查询评论
     * @param pid 商品id
     */
    List<Comment> list(int pid);
}
