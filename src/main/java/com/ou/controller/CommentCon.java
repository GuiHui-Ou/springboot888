package com.ou.controller;

import com.ou.domain.Comments;
import com.ou.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/Comment")
@CrossOrigin(origins = "*",maxAge = 3600)
public class CommentCon {

    @Autowired
    private CommentService commentServiceImpl;


    @GetMapping("/queryAll")
    public List<Comments> queryAll() {
        List<Comments> commentsList = commentServiceImpl.queryAll();
        for (Comments comments : commentsList
        ) {
            System.out.println(comments);
        }
        return commentsList;
    }
}