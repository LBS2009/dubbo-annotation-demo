package com.lbs.helloconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lbs.AsyncService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

/**
 * description: AsyncController
 *
 * @author libosheng
 * @date 2018-9-5
 */
@RestController
public class AsyncController {

    @Reference(async = true)
    private AsyncService asyncService;

    @GetMapping("/async")
    public String async() throws ExecutionException, InterruptedException {
        return asyncService.async();
    }
}
