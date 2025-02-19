package com.ts.service;

import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ts.model.Account;
import com.ts.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	AccountRepository accountRepository;
	
	public Account createAccount(Account account) {
		
		account.setBalance(0);
	
		 // create instance of Random class
        Random rand = new Random();
        // Generate random integers in range 0 to 999
        int accNo = rand.nextInt(1000);
		
		account.setAccNumber(accNo); //777
		
		//-------
		
		return accountRepository.save(account);
	}

	public String addAmount(int accNo, int amount) {

		Optional<Account> acc =  accountRepository.findByAccNumber(accNo);

		if(acc.isPresent()) {
			Account userAccount = acc.get();
		
			int balanceAmount = userAccount.getBalance();
			userAccount.setBalance(balanceAmount + amount);
			
			accountRepository.save(userAccount);
			return "Amount has been added successfully";
			
		} else {
			return "Please add correct account number";
		}
		
	}

}
