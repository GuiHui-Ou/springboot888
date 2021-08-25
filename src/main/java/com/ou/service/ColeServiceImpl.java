package com.ou.service;

import com.ou.domain.Coles;
import com.ou.mapper.ColeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColeServiceImpl implements ColeService {

    @Autowired
    private ColeMapper coleMapper;

    @Override
    public List<Coles> queryAll() {
        return coleMapper.queryAll();
    }
}
