package com.example.demo.model;

import lombok.Data;

@Data
public class Account {

	private Integer accountNumber;
	private String accountHolderName;
	private Double initialBalance;
	private AccountType accountType;
	public Account(String accountHolderName, Double initialBalance, AccountType accountType) {
		super();
		this.accountHolderName = accountHolderName;
		this.initialBalance = initialBalance;
		this.accountType = accountType;
	}
	
}
