package AnnotationPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
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
1. Login-----@BeforeClass
2. Search------ @Test
3. Advance Search----@Test
4. Logout------@AfterClass

 * 
 */



public class AnnotationBeforeClassAfterClass {

	
	@BeforeClass
	void login() {
		
		System.out.println("This is login...");
	}
	
	@AfterClass
	void logout() {
		
		System.out.println("This is Logout...");
	}
	
	
	@Test
	void search() {
		
		System.out.println("This is Search...");
		
	}
	
	@Test
	void advancesearch() {
		
		System.out.println("This is Advance Search...");
	}
	
	
	
}
