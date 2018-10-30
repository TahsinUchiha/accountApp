package com.qa.accountapp.management;

public class Account {
	private String firstName;
	private String lastName;
	private int accountNumber;

	public Account(String firstName, String lastName, int accountNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = accountNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String giveAccount() {
		return "Account [firstName=" + firstName + ", surname=" + lastName + ", accountNumber=" + accountNumber + "]";
	}

}
