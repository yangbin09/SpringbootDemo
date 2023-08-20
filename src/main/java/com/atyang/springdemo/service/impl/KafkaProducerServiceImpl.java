package com.atyang.springdemo.service.impl;

import com.atyang.springdemo.pojo.KafkaMessageDO;
import com.atyang.springdemo.service.KafkaProducerService;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;

/**
 * kafka 生产者
 *
 * @author 阳斌
 */
@Service
public class KafkaProducerServiceImpl implements KafkaProducerService {
    private final KafkaTemplate<String, Object> kafkaTemplate;

    public KafkaProducerServiceImpl(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public String send(KafkaMessageDO kafkaMessage) {
        try {
            ListenableFuture<SendResult<String, Object>> send = kafkaTemplate.send(kafkaMessage.getTopic(), kafkaMessage.getMessage());
            send.addCallback(success -> System.out.println("KafkaMessageProducer 发送消息成功！"), fail -> System.out.println("KafkaMessageProducer 发送消息失败！"));
            // 判断是否发送成功，如果失败，抛出异常
            if (send.isDone()) {
                return "KafkaMessageProducer 发送消息成功！";
            }
            return "KafkaMessageProducer 发送消息失败！";

        } catch (Exception e) {
            e.printStackTrace();
            return "KafkaMessageProducer 发送消息失败！";
        }

    }
}
