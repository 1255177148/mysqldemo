package com.example.mysqldemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.mysqldemo.mapper")
public class MysqldemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MysqldemoApplication.class, args);
    }

}
