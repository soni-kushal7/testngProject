package SauceDemoTestNG;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SauceDemoTest {

	
	WebDriver driver;
	
	
	@BeforeClass
	@Test(priority=1)
	void setup() throws InterruptedException {
		
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
//		Thread.sleep(2000);
		
	}	
	
	
	@Test(priority=2, dataProvider="dp")
	void login(String username, String pwd) throws InterruptedException {
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(5000);
		
		
		/*
		boolean status =driver.findElement(By.xpath("//div[text()='Swag Labs']")).isDisplayed();
		
		if(status==true) {
			
			driver.findElement(By.id("react-burger-menu-btn")).click();
			driver.findElement(By.id("logout_sidebar_link")).click();
			Assert.assertTrue(true);
			
		}else {
			
			Assert.fail();
			
		}
		
		*/
		
	}
	
	
	
	
	/*
	@Test(priority=3, dependsOnMethods="login")
	void logout() {
		
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
		
	}
	*/
	
	
	@AfterClass
	@Test(priority=3)
	void teardown() {
		
		driver.quit();
		
	}
	
	
	@DataProvider(name= "dp")
	Object[][] loginData(){
		
		Object data[][] = {
				
				{"standard_user", "secret_sauce"},
				{"standard_user", "secret"},
				{"locked_out_user", "secret_sauce"},
				{"problem_user", "secret_sauce"},
				{"performance_glitch_user", "secret_sauce"},
				{"error_user", "secret_sauce"},
				{"visual_user", "secret_sauce"},
				
	        		        };
		return data;
		
		
	}
	
	
	//https://tutorialsninja.com/demo/index.php?route=account/login
	//pavanol123@gmail.com
	//test@123
	
	
}
