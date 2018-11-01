package com.qa.integration;


import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.accountapp.service.AccountService;

import org.apache.log4j.Logger;

@Path("/account")
public class AccountEndPoint{

	@Inject
	private AccountService service;

	@Path("/getAllAccounts")
	@GET
	@Produces({ "application/json" })
	public String getAllAccounts() {
		return service.getAllAccounts();
	}

	@Path("/addAccount")
	@POST
	@Produces({ "application/json" })
	public String createAccount(String account) {
		return service.createAccount(account);
	}

	@Path("/deleteAccount/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteAccount(@PathParam("id") Long id) {
		return service.deleteAccount(id);
	}
	@Path("/getAccount/{id}")
	@GET
	@Produces({ "application/json" })
	public String getAccount(@PathParam("id") Long id) {
		return service.getAccount(id);
	}
	@Path("/updateAccount/{id}")
	@PUT
	@Produces({ "application/json" })
	public String updateAccount(@PathParam("id") Long id, String accountToUpdate){
		return service.updateAccount(id, accountToUpdate);
	}
	public void setService(AccountService service) {
		this.service = service;
	}
	
}
