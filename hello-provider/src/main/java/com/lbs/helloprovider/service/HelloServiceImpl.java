package com.lbs.helloprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lbs.HelloService;

/**
 * description: 使用dubbo的Service注解暴露服务
 *
 * @author libosheng
 * @date 2018-9-3
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String name) {
        System.out.println("hello provider 被调用 ...");
        int i = 10 / 0;
        return "hello " + name;
    }
}
