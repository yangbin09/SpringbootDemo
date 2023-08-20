package com.atyang.springdemo.controller.kafka;

import com.atyang.springdemo.pojo.KafkaMessageDO;
import com.atyang.springdemo.service.KafkaProducerService;
import com.atyang.springdemo.utlis.result.Result;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MaSiyi
 * @version 1.0.0 2021/12/10
 * @since JDK 1.8.0
 */
@RestController("/kafkaProducer")
public class KafkaProducerController {
    final KafkaProducerService kafkaProducerService;

    public KafkaProducerController(KafkaProducerService kafkaProducerService) {
        this.kafkaProducerService = kafkaProducerService;
    }


    /**
     * 发送消息
     *
     * @Param: [topic, normalMessage]
     * @return: void
     * @Author: 阳斌
     * @Date: 2023/08/20 12:00
     */
    @ApiOperation(value = "发送kafka消息")
    @PostMapping("/normal/")
    public Result sendMessage(@RequestBody KafkaMessageDO kafkaMessage) {

        String send = kafkaProducerService.send(kafkaMessage);
        return Result.ok(send);
    }

}

