package com.qa.accountapp.service;

import com.qa.accountapp.persistence.AccountServiceDB;


	 public interface AccountService {
			
			

			String getAllAccounts();

			String createAccount(String account);

			String updateAccount(Long id, String accountToUpdate);

			String deleteAccount(Long id);

	 
	

}
