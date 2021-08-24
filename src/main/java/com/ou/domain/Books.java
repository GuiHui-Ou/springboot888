package com.ou.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
    private int id;
    private String bookName;
    private String type;
    private String msg;
    private String img;
    private int number;

}
