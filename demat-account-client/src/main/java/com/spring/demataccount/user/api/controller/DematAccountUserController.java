package com.spring.demataccount.user.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DematAccountUserController {

	@Autowired
	private RestTemplate template;
	
	@Value("${demataccout.provider.url}")
	private String url;
	
	@GetMapping("/getMembershipPlans")
	public List<String> getMembership( ) {
		List<String> membership = template.getForObject(url, List.class);
		return membership;
	}
	
	@Bean
	public RestTemplate template() {
		return new RestTemplate();
	}
	
}
