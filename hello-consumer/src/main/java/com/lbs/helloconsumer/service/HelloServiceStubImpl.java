package com.lbs.helloconsumer.service;

import com.lbs.HelloService;

/**
 * description:
 *
 * @author libosheng
 * @date 2018-9-5
 */
public class HelloServiceStubImpl implements HelloService {

    private final HelloService helloService;

    public HelloServiceStubImpl(HelloService helloService) {
        this.helloService = helloService;
    }

    @Override
    public String hello(String name) {
        try {
            return helloService.hello(name);
        } catch (Exception e) {
            return "stub 容错数据";
        }
    }
}