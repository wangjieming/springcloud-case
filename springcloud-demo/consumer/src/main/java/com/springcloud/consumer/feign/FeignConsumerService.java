package com.springcloud.consumer.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "provider")
public interface FeignConsumerService {

    @RequestMapping("/callServiceProvider")
    String index(@RequestParam("uid") String uid);


}
