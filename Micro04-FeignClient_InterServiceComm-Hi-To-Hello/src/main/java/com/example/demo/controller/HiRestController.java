package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.client.HelloClient;

@RestController
public class HiRestController {
	
	//Autowired Hello client here to call his method
	@Autowired
	private HelloClient helloClient;
	
	@GetMapping("/hi/{name}")
	public String sayHi(@PathVariable ("name") String name) {
		String hiMsg= "Hii";
		//call HelloClient method to get its data (Inter-service-Communication)
		String helloMsg=helloClient.invokeHelloService(name);
		//return combine result
		return hiMsg+" -----  "+helloMsg;
	}//sayHi
}//class
