package com.pandeng.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.pandeng.demo"})
public class PandengWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(PandengWebApplication.class, args);
    }

}
