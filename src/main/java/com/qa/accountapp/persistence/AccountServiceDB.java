package com.qa.accountapp.persistence;

import com.qa.accountapp.management.Account;

public interface AccountServiceDB {
	
	

	String getAllAccounts();

	String createAccount(String account);

	String updateAccount(Long id, String accountToUpdate);

	String deleteAccount(Long id);

	String getAccount(Long id);


	

}

