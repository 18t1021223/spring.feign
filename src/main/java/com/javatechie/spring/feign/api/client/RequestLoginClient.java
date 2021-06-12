package com.javatechie.spring.feign.api.client;

import com.javatechie.spring.feign.api.dto.RequestLogin;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "RequestLogin" , url = "http://localhost:8080/")
public interface RequestLoginClient {
    @RequestMapping(value = "/login" , method = RequestMethod.GET)
    RequestLogin loginClient(@RequestParam String user , @RequestParam String pass);
}
