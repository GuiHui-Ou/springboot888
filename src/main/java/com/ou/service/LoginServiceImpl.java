package com.ou.service;

import com.ou.domain.Login;
import com.ou.mapper.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public Login querylogin() {
        return loginMapper.querylogin();
    }

    @Override
    public List<Login> queryAll() {
        return loginMapper.queryAll();
    }
}
