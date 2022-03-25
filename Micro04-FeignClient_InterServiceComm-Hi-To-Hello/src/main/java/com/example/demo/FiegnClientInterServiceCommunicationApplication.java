package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient     //To register is as a Eureka client
@EnableFeignClients      //Enable fiegn client 
public class FiegnClientInterServiceCommunicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(FiegnClientInterServiceCommunicationApplication.class, args);
	}

}
