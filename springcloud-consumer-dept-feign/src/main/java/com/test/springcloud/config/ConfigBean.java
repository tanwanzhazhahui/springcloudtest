package com.test.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced //Ribbon
    public RestTemplate getRestTemplate(){

        return new RestTemplate();
    }

    //配置负载均衡实现RestTemplate

    @Bean
    public IRule myRule(){
        return new RetryRule();
    }
}
