package com.pandeng.demo.service.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.pandeng.demo.dal.dto.UserDemo;
import com.pandeng.demo.dal.mapper.UserDemoMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@Slf4j
@RequiredArgsConstructor
public class DemoService {

    private final UserDemoMapper userDemoMapper;

    public UserDemo demo() {
        QueryWrapper wrapper = new QueryWrapper<UserDemo>();
        UserDemo userDemo = userDemoMapper.selectOne(wrapper);
        log.info("打印结果：{}", userDemo);
        return userDemo;
    }

}
