package com.example.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(url = "...........")  not Recomanded (bcz maybe URL chnage time to time)
@FeignClient(name = "HELLO-SERVICE") // (name=>client service name)to make this as treat like feign client to access
										                                // other services of same project
public interface HelloClient {
    
	//write abstact method with same method signature method to invoke helloservice
	// here method name can be diff from (HELLO-SERVICE) BUT req param and pram sybtax must be same
	@GetMapping("/hello/{name}")
	public String invokeHelloService(@PathVariable("name")String name);
	
}
