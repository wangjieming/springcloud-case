package com.springcloud.consumer.controller;

import com.springcloud.consumer.feign.FeignConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private FeignConsumerService feignConsumerService;

    @RequestMapping("/index")
    public String index(@RequestParam("uid") String uid) {
        return feignConsumerService.index(uid);
    }

}
