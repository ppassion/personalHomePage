package com.cyh.bean;

import lombok.Data;

@Data
public class Education {
    private int id;
    private int userId;
    private String start;
    private String end;
    private String school;
    private String study;
    private String description;
}
