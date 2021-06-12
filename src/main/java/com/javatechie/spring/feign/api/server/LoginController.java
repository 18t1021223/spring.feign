package com.javatechie.spring.feign.api.server;

import com.javatechie.spring.feign.api.dto.RequestLogin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public RequestLogin login(@RequestParam String user, @RequestParam String pass) {
        return new RequestLogin(user, pass);
    }
}
