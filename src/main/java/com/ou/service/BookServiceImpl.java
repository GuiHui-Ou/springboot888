package com.ou.service;

import com.ou.domain.Books;
import com.ou.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Books> queryAll() {
        return bookMapper.queryAll();
    }
}
