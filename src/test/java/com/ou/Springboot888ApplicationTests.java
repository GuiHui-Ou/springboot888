package com.ou;

import com.ou.domain.Coles;
import com.ou.domain.Books;
import com.ou.domain.Comments;
import com.ou.domain.Login;
import com.ou.service.BookService;
import com.ou.service.ColeService;
import com.ou.service.CommentService;
import com.ou.service.LoginService;
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

    @Autowired
    ColeService coleServiceImpl;

    @Autowired
    CommentService commentServiceImpl;

    @Autowired
    LoginService loginServiceImpl;

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

    @Test
    void queryAll2(){
        for (Comments comments : commentServiceImpl.queryAll()
        ) {
            System.out.println(comments);
        }
    }

    @Test
    void queryAll3(){
        for (Coles coles : coleServiceImpl.queryAll()
        ) {
            System.out.println(coles);
        }
    }

    @Test
    void queryAll4(){
        for (Login login : loginServiceImpl.queryAll()
        ) {
            System.out.println(login);
        }
    }
}
