package com.demo.learn20200101;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.demo.learn20200101.dao.mapper")
public class Learn20200101Application {

    public static void main(String[] args) {
        SpringApplication.run(Learn20200101Application.class, args);
    }

}
