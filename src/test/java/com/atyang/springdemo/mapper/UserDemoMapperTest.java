package com.atyang.springdemo.mapper;

import com.atyang.springdemo.SpringDemoApplicationTests;
import com.atyang.springdemo.pojo.UserDemo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;


@Slf4j
public class UserDemoMapperTest extends SpringDemoApplicationTests {
    //继承了BaseMapper所有的方法，可以编写自己的扩展方法
    @Autowired
    private UserMapper userMapper;

    //测试更新
    @Test
    public void testUpdate() {
        UserDemo userOd = new UserDemo();
        //可以通过条件自动拼接动态SQL
        userOd.setId(6L);
        userOd.setName("id:5,修改过后");
        //updateById 参数是一个对象！
        int i = userMapper.updateById(userOd);
        System.out.println(i);
    }

    //测试更新
    @Test
    public void testUpdate1() {
        UserDemo userOd = userMapper.selectById(6L);
        userOd.setName("测试编辑");
        //updateById 参数是一个对象！
        int i = userMapper.updateById(userOd);
        System.out.println(i);
    }

    //测试更新
    @Test
    public void test07() {
        QueryWrapper<UserDemo> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("age", "email");
        List<Map<String, Object>> maps = userMapper.selectMaps(queryWrapper);
        maps.forEach(System.out::println);
    }


    @Test
    public void testSelect() {
        System.out.println("--------selectAll method test-------");
        //查询全部用户，参数是一个Wrapper，条件构造器，先不使用为null
        List<UserDemo> userOdList = userMapper.selectList(null);
        userOdList.forEach(System.out::println);
    }

    //测试插入
    @Test
    public void testInsert() {
        UserDemo userOd = new UserDemo();
        userOd.setName("小文");
        userOd.setAge(21);
        userOd.setEmail("2312103645@qq.com");
        int insert = userMapper.insert(userOd);//如果没有设置id，那么会自动生成id
        System.out.println(insert);//受影响行数
        System.out.println(userOd);//id会自动回填
    }

    //测试更新
    @Test
    public void testUpdate11() {
        UserDemo userOd = new UserDemo();
        //可以通过条件自动拼接动态SQL
        userOd.setId(5L);
        userOd.setName("id:5,修改过后");
        //updateById 参数是一个对象！
        int i = userMapper.updateById(userOd);
        System.out.println(i);
    }


}