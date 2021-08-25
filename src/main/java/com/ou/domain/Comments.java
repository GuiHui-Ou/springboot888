package com.ou.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comments {
    private int id;
    private String bookName;
    private String userName;
    private String content;
}
