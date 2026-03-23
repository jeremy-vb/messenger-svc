package com.yharnam.messengers_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MessengersServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessengersServiceApplication.class, args);
	}

}
