package com.javatechie.spring.feign.api.client.Configurations;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RequestIntercepter implements RequestInterceptor {

    /**
     * add variable header to request  ->  api
     * @param requestTemplate
     */
    @Override
    public void apply(RequestTemplate requestTemplate) {
        requestTemplate.header("name1","abc1");
        requestTemplate.header("name","abc");
    }
}
