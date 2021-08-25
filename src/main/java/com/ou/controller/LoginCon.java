package com.ou.controller;


import com.ou.domain.Login;
import com.ou.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/Login")
@CrossOrigin(origins = "*",maxAge = 3600)
public class LoginCon {

    @Autowired
    private LoginService loginServiceImpl;


    @RequestMapping("/login")
    public String login(String username, String pwd) {
        Login userName = loginServiceImpl.querylogin();
        if (username.equals(userName.getUserName()) && pwd.equals(userName.getPassword())) {
            return "redirect:/book/allBook";
        }else {
            return "fail";
        }
    }

    @GetMapping("/queryAll")
    public List<Login> queryAll() {
        List<Login> loginsList = loginServiceImpl.queryAll();
        for (Login login : loginsList
        ) {
            System.out.println(login);
        }
        return loginsList;
    }
}