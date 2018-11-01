package com.qa.accountapp.service;

import javax.inject.Inject;

import com.qa.accountapp.management.Account;
import com.qa.accountapp.persistence.AccountServiceDB;



public class AccountServiceImpl implements AccountService {
	
	

	

	@Inject
	private AccountServiceDB service;

	public String getAllAccounts() {
		return service.getAllAccounts();
	}

	public String addAccount(String account) {
		return service.createAccount(account);
	}

	public String deleteAccount(Long id) {
		return service.deleteAccount(id);
	}
	
	public String updateAccount(Long id, String accountToUpdate) {
		return service.updateAccount(id, accountToUpdate);
	}
	
	public String createAccount(String account) {
		return service.createAccount(account);
	}

	public void setRepo(AccountServiceDB persist) {
		this.service = persist;
	}
	
	
	public String getAccount(Long id) {
		return service.getAccount(id);
	}


	
	

}
