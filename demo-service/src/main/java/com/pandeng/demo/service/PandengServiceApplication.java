package com.pandeng.demo.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@MapperScan(basePackages = {"com.pandeng.demo.dal.mapper"})
public class PandengServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PandengServiceApplication.class, args);
    }

}
