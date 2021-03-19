package com.cyh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


@MapperScan("com.cyh.dao.mapper")
@SpringBootApplication
public class MyBootApplication {

    public static void main(String[] args) {

    	SpringApplication.run(MyBootApplication.class, args);
    }

}
