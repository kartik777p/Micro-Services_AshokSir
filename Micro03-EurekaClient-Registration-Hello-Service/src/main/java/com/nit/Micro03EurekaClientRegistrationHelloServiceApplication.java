package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient  //Enable client to a service registry
public class Micro03EurekaClientRegistrationHelloServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Micro03EurekaClientRegistrationHelloServiceApplication.class, args);
	}

}
