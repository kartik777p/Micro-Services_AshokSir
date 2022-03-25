package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiRestController {
	
	@GetMapping("/hi/{name}")
	public String sayHi(@PathVariable ("name") String name) {
		return "Hii "+name+" How Are You ? ";
	}//sayHi
	
}//class
