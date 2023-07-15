package com.pandeng.demo.service.controller;

import com.pandeng.demo.dal.dto.UserDemo;
import com.pandeng.demo.service.service.DemoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/demo")
public class DemoController {

    private final DemoService demoService;

    @RequestMapping("/test")
    public UserDemo getUserDemo(){
        return demoService.demo();
    }


}
