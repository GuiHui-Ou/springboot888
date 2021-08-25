package com.ou.service;

import com.ou.domain.Login;

import java.util.List;

public interface LoginService {
    Login querylogin();
    List<Login> queryAll();

}
