package com.lbs.helloprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lbs.AsyncService;

/**
 * description: 异步调用实现类
 *
 * @author libosheng
 * @date 2018-9-5
 */
@Service(timeout = 5000)
public class AsyncServiceImpl implements AsyncService {

    @Override
    public String async() {
        System.out.println("...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("... ...");
        return "async";
    }
}
