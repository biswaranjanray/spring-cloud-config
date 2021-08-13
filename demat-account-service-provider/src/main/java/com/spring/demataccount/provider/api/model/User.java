package com.spring.demataccount.provider.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	private String name;
	private String email;
	private String phone;
	private String panNumber;
	private String bankAccountNumber;
	private String dematAccountNumber;
}
