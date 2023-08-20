package com.atyang.springdemo.controller.user;


import com.atyang.springdemo.pojo.UserDemo;
import com.atyang.springdemo.service.UserService;
import com.atyang.springdemo.utlis.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 阳斌
 */
@Api(tags = "用户管理")
@RestController
@RequestMapping("/user")
public class UserController {

    /**
     * 注入service
     */
    private final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * 测试查询所有角色
     *
     * @return 返回结果
     */
    @ApiOperation(value = "查询所有用户")
    @GetMapping("findAll")
    public Result findAll() {
        //查询所有角色
        List<UserDemo> roleList = userService.list();

        return Result.ok(roleList);
    }


}
