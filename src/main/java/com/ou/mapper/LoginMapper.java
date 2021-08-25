package com.ou.mapper;

import com.ou.domain.Login;
import org.apache.ibatis.annotations.Mapper;
;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface LoginMapper {
    Login querylogin();
    List<Login> queryAll();
}
