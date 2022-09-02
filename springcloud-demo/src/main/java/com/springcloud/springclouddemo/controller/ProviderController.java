package com.springcloud.springclouddemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@EnableAutoConfiguration
@EnableDiscoveryClient
@Configuration(proxyBeanMethods = false)
@RestController
@RequestMapping("/")
public class ProviderController {



    private RestTemplate rest = new RestTemplate();


    @RequestMapping(value = "/callServiceProvider", method = RequestMethod.GET)
    public String sayHello(@RequestParam("uid") String uid) {
        return "uid:" + uid + "调用了本服务提供者";
    }




    @RequestMapping("/hello")
    public String hello() {
       return rest.getForObject("http://" + "Provider" + "/hi", String.class);
    }



}
