package com.atyang.springdemo.service;

import com.atyang.springdemo.SpringDemoApplicationTests;
import com.atyang.springdemo.pojo.UserDemo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@Slf4j
public class UserDemoServiceTest extends SpringDemoApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void test01() {
        // 查询全部
        userService.list().forEach(System.out::println);
    }

    //测试更新
    @Test
    public void userServiceQueryList() {

        // 测试条件查询
        QueryWrapper<UserDemo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name", "id:5,修改过后");
        //根据条件查询 返回集合
        List<UserDemo> userOdList = userService.list(queryWrapper);
        // 打印集合
        userOdList.forEach(System.out::println);
    }


}