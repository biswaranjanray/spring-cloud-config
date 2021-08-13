package com.spring.demataccount.user.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class DematAccountUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(DematAccountUserApplication.class, args);
	}

}
