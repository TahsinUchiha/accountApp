package com.qa.accountapp.app;

import java.util.HashMap;

import com.qa.accountapp.management.Account;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World this is a message from the master branch");
		
		System.out.println("Hello this is an edit from accountAppEdits!");
		
		 
		 
		Account joe =  new Account("Joe","Jo",1); 
		Account jo  = new Account("Jo","Jo",2); 
		Account j = new Account("J","J",3); 
		 
		
		
	System.out.println(jo.giveAccount());
	System.out.println(joe.giveAccount());
	
	

	
	
	
		
	
		

	}

}
