package com.javatechie.spring.feign.api.client;

import com.javatechie.spring.feign.api.dto.Post;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(url="https://jsonplaceholder.typicode.com",name="USER-CLIENT")
public interface UserClient {

	@RequestMapping(method = RequestMethod.GET, value = "/posts")
	List<Post> getPosts();
	
}
