package com.qa.accountapp.service;

import javax.inject.Inject;

import com.qa.accountapp.persistence.AccountServiceDB;



public class AccountServiceImpl implements AccountService {
	
	

	

	@Inject
	private AccountServiceDB persist;

	public String getAllAccounts() {
		return persist.getAllAccounts();
	}

	public String addAccount(String account) {
		return persist.createAccount(account);
	}

	public String deleteAccount(Long id) {
		return persist.deleteAccount(id);
	}
	
	public String updateAccount(Long id, String accountToUpdate) {
		return persist.updateAccount(id, accountToUpdate);
	}
	
	public String createAccount(String account) {
		return persist.createAccount(account);
	}

	public void setRepo(AccountServiceDB persist) {
		this.persist = persist;
	}
	
	
	

}
