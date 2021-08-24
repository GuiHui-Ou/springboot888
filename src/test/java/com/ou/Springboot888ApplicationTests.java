package com.ou;

import com.ou.mapper.BookMapper;
import com.ou.domain.Books;
import com.ou.service.BookService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.SQLException;


@RunWith(SpringRunner.class)
@SpringBootTest
class Springboot888ApplicationTests {


    @Autowired
    DataSource dataSource;

    @Autowired
    BookService bookServiceImpl;
    @Test
    void contextLoads() throws SQLException {
        System.out.println(dataSource.getClass());
        System.out.println(dataSource.getConnection());

    }

    @Test
    void queryAll(){
        for (Books books: bookServiceImpl.queryAll()
             ) {
            System.out.println(books);
        }
    }

}
