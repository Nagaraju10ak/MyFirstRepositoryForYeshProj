package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsTestNg2  {
	public static ChromeDriver driver;
	@BeforeSuite
	public void beforeSuite()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 driver = new ChromeDriver();
	}
	
	@BeforeTest
	public void myTest()
	{
		//comme
		//sdfasdt
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void runTest3()
	{
		
		
		
		
		
		
		driver.findElement(By.name("q")).sendKeys("abc");
	}
	
	@AfterSuite
	public void afterMSuite()
	{
		driver.close();
		
	}
}
