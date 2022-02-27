package com.servicedis.clientdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ClientDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientDiscoveryApplication.class, args);
	}

}
