package com.lbs.helloconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.rpc.service.EchoService;
import com.lbs.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description: EchoController
 *
 * @author libosheng
 * @date 2018-9-5
 */
@RequestMapping("/echo")
@RestController
public class EchoController {

    @Reference
    private HelloService helloService;

    @GetMapping("/helloService")
    public String helloServiceEcho() {
        EchoService echoService = (EchoService) helloService;
        return (String) echoService.$echo("ok");
    }
}
