package ListnersPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeHRM {

WebDriver driver;
	
	@BeforeTest
	void setup() {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	
	@Test(priority= 1 )
	void testLogo() {
		boolean status =driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(status,true);
	}
	
	
	@Test(priority=2)
	void testAppURL() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/");
	}
	
	
	@Test(priority=3, dependsOnMethods={"testAppURL"})	
	void testHomePageTitle() {
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	
	
	@AfterClass
	void tearDown() {
		driver.quit();
	}
	
	
	
}
