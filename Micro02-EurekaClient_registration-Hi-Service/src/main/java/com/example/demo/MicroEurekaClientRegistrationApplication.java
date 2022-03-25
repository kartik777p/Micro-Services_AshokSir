package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient     //To register is as a Eureka client
public class MicroEurekaClientRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroEurekaClientRegistrationApplication.class, args);
	}

}
