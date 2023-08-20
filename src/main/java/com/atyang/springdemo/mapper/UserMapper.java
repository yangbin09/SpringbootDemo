package com.atyang.springdemo.mapper;

import com.atyang.springdemo.pojo.UserDemo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;


/**
 * 再对应的mapper上面实现基本的接口 BaseMapper
 * @author 阳斌
 */
@Mapper
public interface UserMapper extends BaseMapper<UserDemo> {
    //所有的CRUD都已经完成
    //不需要像以前一样配置一大堆文件：pojo-dao（连接mybatis，配置mapper.xml文件）==>service-controller
}