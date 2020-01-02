package edu.swjtuhc.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.Comment;
import edu.swjtuhc.demo.service.CommentService;

@RestController
@RequestMapping("comment")
public class CommentController {
	@Autowired
    private CommentService commentService;

    @RequestMapping("save")
    public Map<String, Object> save(Comment comment) {
        Map<String, Object> map = new HashMap<>();
        try {
            commentService.save(comment);
            map.put("state", 1);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("state", -1);
        }
        return map;
    }

    @RequestMapping("list")
    public Map<String, Object> list(int pid) {
        Map<String, Object> map = new HashMap<>();
        map.put("list", commentService.list(pid));
        return map;
    }
}
