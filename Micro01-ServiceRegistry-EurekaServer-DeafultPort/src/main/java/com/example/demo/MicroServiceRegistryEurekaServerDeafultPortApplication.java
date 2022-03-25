package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer  //TO ENABLE EUREKA SERVER
public class MicroServiceRegistryEurekaServerDeafultPortApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceRegistryEurekaServerDeafultPortApplication.class, args);
	}

}
