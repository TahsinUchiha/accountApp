package com.qa.accountapp.persistence;

import com.qa.accountapp.management.Account;
import com.qa.accountapp.service.*;

public interface AccountServiceDB {
	
	

	String getAllAccounts();

	String createAccount(String account);

	String updateAccount(Long id, String accountToUpdate);

	String deleteAccount(Long id);
	
	String searchAccount(Account idToSearch);

}

