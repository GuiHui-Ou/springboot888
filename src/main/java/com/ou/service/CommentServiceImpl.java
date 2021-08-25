package com.ou.service;

import com.ou.domain.Comments;
import com.ou.mapper.CommentsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService{

    @Autowired
    CommentsMapper commentsMapper;

    @Override
    public List<Comments> queryAll() {
        return commentsMapper.queryAll();
    }
}
