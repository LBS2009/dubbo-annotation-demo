package com.lbs.helloconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lbs.HelloService;
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

    @Reference(
            stubevent = true,
            stub = "com.lbs.helloconsumer.service.HelloServiceStubImpl"
            //mock = "com.lbs.helloconsumer.service.HelloServiceMockImpl"
    )
    private HelloService helloService;

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        return helloService.hello(name);
    }
}
