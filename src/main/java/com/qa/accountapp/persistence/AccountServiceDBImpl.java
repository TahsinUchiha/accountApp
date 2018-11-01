package com.qa.accountapp.persistence;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.Collection;

import javax.enterprise.inject.Default;
import javax.inject.Inject;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.qa.accountapp.management.Account;
import com.qa.util.JSONUtil;

@Transactional(SUPPORTS)
@Default
public class AccountServiceDBImpl implements AccountServiceDB{

	

	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	@Inject
	private JSONUtil util;

	
	public String getAllAccounts() {
		Query query =  manager.createQuery("Select a FROM Account a");
		Collection<Account> accounts = (Collection<Account>) ((javax.persistence.Query) query).getResultList();
		return util.getJSONForObject(accounts);
	}


	@Transactional
	public String createAccount(String account) {
		Account anAccount = util.getObjectForJSON(account, Account.class);
		manager.persist(anAccount);
		if (anAccount.getAccountNumber().equals(9999))
				{
			return "{\"message\": \"This account is blocked\"}";
		} 
		return "{\"message\": \"account has been sucessfully added\"}";
	}


	@Transactional(REQUIRED)
	public String updateAccount(Long id, String accountToUpdate) {
		Account updatedAccount = util.getObjectForJSON(accountToUpdate, Account.class);
		Account accountFromDB = findAccount(id);
		if (accountToUpdate != null) {
			accountFromDB = updatedAccount;
			manager.merge(accountFromDB);
		}
		return "{\"message\": \"account sucessfully updated\"}";
	}
	
	
	
	@Transactional(REQUIRED)
	public String getAccount(Long id) {
		Account accountInDB = findAccount(id);
		 return util.getJSONForObject(accountInDB);
		
	}



	
	@Transactional(REQUIRED)
	public String deleteAccount(Long id) {
		Account accountInDB = findAccount(id);
		if (accountInDB != null) {
			manager.remove(accountInDB);
		}
		return "{\"message\": \"account sucessfully deleted\"}";
	}

	private Account findAccount(Long id) {
		return manager.find(Account.class, id);
	}

	public void setManager(EntityManager manager) {
		this.manager = manager;
	}

	public void setUtil(JSONUtil util) {
		this.util = util;
	}





}
	
	

