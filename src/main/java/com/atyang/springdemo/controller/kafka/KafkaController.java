package com.atyang.springdemo.controller.kafka;


import com.atyang.springdemo.utlis.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 阳斌
 */
@SuppressWarnings("rawtypes")
@Api(tags = "kafka管理")
@RestController
@RequestMapping("/kafkaInfo")
public class KafkaController {


    /**
     * 测试查询所有角色
     *
     * @return 返回结果
     */
    @ApiOperation(value = "查询所有kafka信息")
    @GetMapping("findAll")
    public Result findAll() {


        return Result.ok("kafkaInfo");
    }


}
