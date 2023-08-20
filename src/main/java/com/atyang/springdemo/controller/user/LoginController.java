package com.atyang.springdemo.controller.user;


import com.atyang.springdemo.pojo.UserDemo;
import com.atyang.springdemo.service.UserService;
import com.atyang.springdemo.utlis.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 阳斌
 */
@Api(tags = "用户登录")
@RestController
@RequestMapping("/login")
public class LoginController {

    /**
     * 注入service
     */
    private final UserService userService;


    public LoginController(UserService userService) {
        this.userService = userService;
    }

    /**
     * 测试查询所有角色
     *
     * @return 返回结果
     */
    @ApiOperation(value = "查询所有用户")
    @PostMapping("loginuser")
    public Result findAll(@RequestBody UserDemo userDemo) {

        //查询所有角色
        List<UserDemo> roleList = userService.list();

        if ("admin".equals(userDemo.getName())){
            return Result.ok(roleList);
        }

        return Result.fail().message("登录失败");
    }


}
