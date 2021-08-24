package com.ou.controller;


import com.ou.domain.Books;
import com.ou.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Book")
public class BookCon {

    @Autowired
    private BookService bookServiceImpl;

    @GetMapping("/queryAll")
    public List<Books> queryAll(){
        List<Books> booksList = bookServiceImpl.queryAll();
        for (Books book: booksList
             ) {
            System.out.println(book);
        }
        return booksList;
    }
}
