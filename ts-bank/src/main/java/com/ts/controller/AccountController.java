package com.ts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ts.model.Account;
import com.ts.service.AccountService;

@RestController
@RequestMapping("/api/account")
public class AccountController {
	@Autowired
	AccountService accountService;

	@PostMapping("/add") // localhost:8080/api/account/add
	public Account createAccount(@RequestBody Account account) {
		Account acc =  accountService.createAccount(account);
		return acc;
	}

	@PutMapping("/add-amount")
	public String addAmount(@RequestParam("accNo") int accNo,
						    @RequestParam("amount") int amount) {
		return accountService.addAmount(accNo, amount);
	}
	
	// withdraw 
	
	// transferAmount
	
	//deleteAccount
	
	//checkBalance
	
}
