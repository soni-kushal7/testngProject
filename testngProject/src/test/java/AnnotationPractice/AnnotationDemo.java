package AnnotationPractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*



Annotations--->

@Test

@BeforeMethod
@AfterMethod

@BeforeClass
@AfterClass

@BeforeTest
@AfterTest

@BeforeSuite
@AfterSuite

TC-1
1. Login----@BeforeMethod
2. Search----- @Test
3. Logout--->@AfterMethod
4. Login
5. Advance Search----@Test
6. Logout

 * 
 */


public class AnnotationDemo {

	@BeforeMethod
	void login() {
		
		System.out.println("This is login...");
		
	}
	
	@AfterMethod
	void logout() {
		
		System.out.println("This is Logout...");
	}
	
	
	@Test(priority=1)
	void search() {
		
		System.out.println("This is Search...");
	}
	
	@Test(priority=2)
	void advancesearch() {
		
		System.out.println("This is Advance Search...");
		
	}
	
	
	
	
	
	
}
