package com.atyang.springdemo.service;

import com.atyang.springdemo.pojo.KafkaMessageDO;

/**
 * @author 阳斌
 */
public interface KafkaProducerService {

    String send(KafkaMessageDO kafkaMessageDO);
}
