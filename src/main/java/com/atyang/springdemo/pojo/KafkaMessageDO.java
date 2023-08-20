package com.atyang.springdemo.pojo;

import lombok.Data;

/**
 * 用户实体类
 *
 * @author 阳斌
 */
@Data
public class KafkaMessageDO {

    /**
     * topic
     */
    private String topic;

    /**
     * 消息
     */
    private String message;
}