package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class StaticParameterizationTestNg {
	
	WebDriver driver;
	
	//STEP 1: system set , object creation should be fine for once
	//STEP 2 : url should launch before every test
	
	@BeforeSuite
	public void setPrerequsites()
	{
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		 

		 
	}
	@BeforeMethod
	public void setBrowser()
	{
		
		driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 
	}
	

	@Test
	@Parameters({"userName","password"})
	public void TestCase001(String userName, String password )
	{
		
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(password);
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		
	}
	@Test
	public void TestCase002()
	{
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManger");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
		
	}
}
