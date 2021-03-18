package com.cyh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.cyh.dao")
@SpringBootApplication
public class MyBootApplication {

    public static void main(String[] args) {

    	SpringApplication.run(MyBootApplication.class, args);
    }

}
