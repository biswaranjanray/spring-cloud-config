package com.spring.demataccount.server.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DemataccountServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemataccountServerApplication.class, args);
	}

}
