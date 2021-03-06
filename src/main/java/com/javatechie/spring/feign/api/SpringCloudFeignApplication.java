package com.javatechie.spring.feign.api;

import com.javatechie.spring.feign.api.client.RequestLoginClient;
import com.javatechie.spring.feign.api.client.UserClient;
import com.javatechie.spring.feign.api.dto.Post;
import com.javatechie.spring.feign.api.dto.RequestLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@SpringBootApplication
@RestController
@EnableFeignClients
public class SpringCloudFeignApplication {
    @Autowired
    private UserClient client;
    @Autowired
    private RequestLoginClient requestLoginClient;

    @GetMapping("/initRequest")
    public RequestLogin initRequest(HttpServletRequest req) {
        Map<String, Object> headers = Collections.list(req.getHeaderNames())
                .stream()
                .collect(Collectors.toMap(name -> name, req::getHeader));
        return requestLoginClient.loginClient(headers, "anh_anh", "123123");
    }

    @GetMapping("/findAllPost")
    public List<Post> getAllPost() throws IOException {
        return client.getPosts();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudFeignApplication.class, args);
    }
}
