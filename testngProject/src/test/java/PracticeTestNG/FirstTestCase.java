package PracticeTestNG;

import org.testng.annotations.Test;

/*

1. open app
2. Login
3. Logout

 * 
 */



public class FirstTestCase {

	
	@Test(priority=1)
	void openapp() {
		
		System.out.println("Oppen app");
		
	}
	
	
	@Test(priority=2)
	void login() {
		
		System.out.println("Login");
	}
	
	
	@Test(priority=3)
	void logout() {
		
		System.out.println("Logout");
	}
	
	
	
	
	
	
}
