package com.atyang.springdemo.service.impl;

import com.atyang.springdemo.mapper.UserMapper;
import com.atyang.springdemo.pojo.UserDemo;
import com.atyang.springdemo.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * UserServiceImpl 实现类
 * @author 阳斌
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDemo> implements UserService {
}
