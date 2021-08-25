package com.ou.controller;


import com.ou.domain.Coles;
import com.ou.service.ColeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Cole")

@CrossOrigin(origins = "*",maxAge = 3600)

public class ColeCon {

    @Autowired
    private ColeService coleServiceImpl;


    @GetMapping("/queryAll")
    public List<Coles> queryAll() {
        List<Coles> colesList = coleServiceImpl.queryAll();
        for (Coles coles : colesList
        ) {
            System.out.println(coles);
        }
        return colesList;
    }
}
