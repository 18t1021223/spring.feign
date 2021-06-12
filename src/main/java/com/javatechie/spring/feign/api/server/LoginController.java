package com.javatechie.spring.feign.api.server;

import com.javatechie.spring.feign.api.dto.RequestLogin;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class LoginController {
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public RequestLogin login(@RequestHeader Map<String, Object> headers, @RequestParam String user, @RequestParam String pass) {
        headers.forEach((k, v) -> System.out.println(k + ": " + v));
        return new RequestLogin(user, pass);
    }
}
