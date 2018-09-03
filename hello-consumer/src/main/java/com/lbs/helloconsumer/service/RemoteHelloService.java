package com.lbs.helloconsumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lbs.HelloService;
import org.springframework.stereotype.Service;

/**
 * description: RemoteHelloService
 *
 * @author libosheng
 * @date 2018-9-3
 */
@Service
public class RemoteHelloService {

    @Reference(check = false)
    private HelloService helloService;

    /**
     * 调用远程服务
     * @param name 名字
     * @return String
     */
    public String hello(String name) {
        return helloService.hello(name);
    }
}
