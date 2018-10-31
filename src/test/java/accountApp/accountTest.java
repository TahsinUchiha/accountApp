package accountApp;

import org.junit.Assert;

import com.qa.accountapp.management.Account;
import com.qa.accountapp.management.Service;

import org.junit.Test;

public class accountTest {
	


	
	@Test
	public void test() {
//		fail("Not yet implemented");
	}
	
	
	
//	@Test
//	public void searchTest() {
//	
//	Service search = new Service();
//	
//	
//	}
	
	@Test
	public void accTest() {
		
		Account acc1 = new Account("Mew", "Mew", 12345);
		Account acc2 = new Account("TDD", "MAN", 123456);
		Account acc3 = new Account("Mew", "hello", 123);
		

	System.out.println(	acc1.giveAccount());
	System.out.println(	acc2.giveAccount());
	System.out.println(	acc3.giveAccount());
		
		
		
		
		
	}
	
	public void cycleTest() {
		
		
		Account test1= new Account("Test", "Mew", 12345);
		Account test2 = new Account("Test", "Hi", 123456);

		
		Service search = new Service();
		
		search.addAccount(test1);
		search.addAccount(test2);
		
		
	
		Assert.assertTrue(search.searchFunction("Test"));
		search.searchFunction("Test");
		
		


		
	}

}
