package com.atyang.springdemo.controller.html;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author 阳斌
 */
@Controller
public class IndexController {


    @RequestMapping("index")
    public String test1(){
        return "/pages/index";
    }

    @RequestMapping("login")
    public String login(){
        return "/login/login";
    }
}
