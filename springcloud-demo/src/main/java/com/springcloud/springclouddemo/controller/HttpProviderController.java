package com.springcloud.springclouddemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/")
public class HttpProviderController {

    @RequestMapping(value = "/httpServerProvider", method = RequestMethod.GET)
    public String sayHello() {
        return "Hello World";
    }

}
