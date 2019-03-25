package com.example.eurekaanotherclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaAnotherclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaAnotherclientApplication.class, args);
	}

}
