package com.lbs.helloconsumer.config;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.lbs.GroupService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * description: 等效于 application.properties 的配置项
 *
 * @author libosheng
 * @date 2018-9-3
 */
@Configuration
public class ConsumerConfiguration {

    /**
     * 等效于 dubbo.application.name=hello-consumer
     * @return ApplicationConfig
     */
    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("hello-consumer");
        return applicationConfig;
    }

    /**
     * 等效于 dubbo.registry.address=zookeeper://192.168.52.201:2181
     * @return RegistryConfig
     */
    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://192.168.52.201:2181");
        //registryConfig.setCheck(false);
        return registryConfig;
    }

    //@Bean
    //public ConsumerConfig consumerConfig() {
    //    ConsumerConfig consumerConfig = new ConsumerConfig();
    //    consumerConfig.setCheck(false);
    //    return consumerConfig;
    //}

    @Bean
    public ReferenceConfig<GroupService> groupReferenceConfig() {
        ReferenceConfig<GroupService> groupReferenceConfig = new ReferenceConfig<>();
        //groupReferenceConfig.setGroup("*");
        groupReferenceConfig.setMerger("true");
        return groupReferenceConfig;
    }

    //@Bean
    //public MethodConfig groupMethodConfig() {
    //    MethodConfig methodConfig = new MethodConfig();
    //    methodConfig.setName("group");
    //    methodConfig.setMerger("true");
    //}
}
