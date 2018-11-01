package com.qa.accountapp.persistence;

public interface AccountServiceDB {
	
	

	String getAllAccounts();

	String createAccount(String accout);

	String updateAccount(Long id, String accountToUpdate);

	String deleteAccount(Long id);

}

