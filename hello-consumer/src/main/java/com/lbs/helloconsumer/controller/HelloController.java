package com.lbs.helloconsumer.controller;

import com.lbs.helloconsumer.service.RemoteHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * description: HelloController
 *
 * @author libosheng
 * @date 2018-9-3
 */
@RestController
public class HelloController {

    @Autowired
    private RemoteHelloService helloService;

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        return helloService.hello(name);
    }
}
