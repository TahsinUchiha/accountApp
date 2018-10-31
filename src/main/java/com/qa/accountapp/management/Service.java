package com.qa.accountapp.management;

import java.util.HashMap;
import java.util.Map;

public class Service {

	private Map<Integer, Account> hmap = new HashMap<Integer, Account>();
	private static int id = 1;

	public Boolean searchFunction(String searchName) {

		long entry = hmap.entrySet().stream().filter(e -> e.getValue().equals(searchName)).count();

		System.out.println(entry + "With this name");

		if (entry > 0) {
			return true;
		} else

			return false;

	}

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
