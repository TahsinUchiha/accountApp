package com.qa.accountapp.persistence;

public interface AccountServiceDB {
	
	

	String getAllAccounts();

	String createAccount(String account);

	String updateAccount(Long id, String accountToUpdate);

	String deleteAccount(Long id);

}

