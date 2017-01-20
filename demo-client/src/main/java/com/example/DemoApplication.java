package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@SpringBootConfiguration
@EnableFeignClients
public class DemoApplication {
	@Autowired
	RestClient testClient;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
