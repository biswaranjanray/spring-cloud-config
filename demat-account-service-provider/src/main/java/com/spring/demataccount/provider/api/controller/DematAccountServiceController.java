package com.spring.demataccount.provider.api.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.demataccount.provider.api.model.User;

@RestController
@RequestMapping("/demataccountservice/api/v1")
public class DematAccountServiceController {

	@GetMapping("/getUpdatedMembershipPlans")
	public List<String> getMembershipPlans() {
		return Stream.of("monthly", "quarterly", "yearly").collect(Collectors.toList());
	}
}
