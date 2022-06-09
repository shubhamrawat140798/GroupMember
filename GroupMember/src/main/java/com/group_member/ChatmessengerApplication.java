package com.group_member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ChatmessengerApplication {
	public static void main(String[] args) {
		SpringApplication.run(ChatmessengerApplication.class, args);
	}

}
