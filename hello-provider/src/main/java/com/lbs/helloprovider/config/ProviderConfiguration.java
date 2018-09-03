package com.lbs.helloprovider.config;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * description: 等效于 application.properties 的配置项
 *
 * @author libosheng
 * @date 2018-9-3
 */
@Configuration
public class ProviderConfiguration {

    /**
     * 等效于 dubbo.application.name=hello-provider
     * @return ApplicationConfig
     */
    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("hello-provider");
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
        return registryConfig;
    }

    /**
     * 等效于 dubbo.protocol.name=dubbo; dubbo.protocol.port=20880
     * @return ProtocolConfig
     */
    @Bean
    public ProtocolConfig protocolConfig() {
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20880);
        return protocolConfig;
    }
}
