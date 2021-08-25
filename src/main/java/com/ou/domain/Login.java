package com.ou.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Login {
    private int id;
    private String userName;
    private String password;
    private String phone;
    private String age;
    private String email;
}
