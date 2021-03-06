package com.qa.accountapp.management;
//changes
import java.util.HashMap;

import com.qa.util.JSONUtil;
import java.util.Map;

import javax.enterprise.inject.Alternative;

import com.qa.accountapp.persistence.AccountServiceDB;
@Alternative
public class Service {

	private Map<Integer, Account> hmap = new HashMap<Integer, Account>();
	private static int id = 1;

	public Boolean searchFunction(String searchName) {

		long entry = hmap.entrySet().stream().filter(eachAccount -> eachAccount.getValue().equals(searchName)).count();

		System.out.println(entry + "With this name");

		if (entry > 0) {
			return true;
		} else

			return false;
		

	}
	

//	public String getAllAccounts() {
//		return util.getJSONForObject(Service.values());
//	}
//	
//	public String createAccount(String account) {
//		ID++;
//		Account newAccount = util.getObjectForJSON(account, Account.class);
//		accountMap.put(ID, newAccount);
//		return account;
//	}

	public void addAccount(Account accountToAdd) {
		hmap.put(id, accountToAdd);
		id++;
	}

	public Account searchAccount(Account idToSearch) {
		Account result = hmap.get("idToSearch");
		return result;
	}

	public void delAccount(Integer idToDel) {
		hmap.remove(idToDel);
	}

	public Map<Integer, Account> getAccount() {
		return hmap;
	}

	public void setAccountMap(Map<Integer, Account> account) {
		this.hmap = account;
	}

}
