package com.qa.accountapp.management;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(length = 100)
	private String firstName;
	@Column(length = 50)
	private String lastName;
	@Column(length = 4)
	private int accountNumber;
	
	
	
	
	private String title;
	
	private String genre;



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
