package com.lbs.helloprovider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 服务提供者
 *
 * @author libosheng
 */
@EnableDubbo
@SpringBootApplication
public class HelloProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloProviderApplication.class, args);
	}
}
