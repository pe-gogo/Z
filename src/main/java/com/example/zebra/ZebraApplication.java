package com.example.zebra;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.zebra.mapper")
@SpringBootApplication
public class ZebraApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZebraApplication.class, args);
    }

}
