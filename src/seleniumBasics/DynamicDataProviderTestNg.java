package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DynamicDataProviderTestNg {
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
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 
	}
	

	@Test(dataProvider = "data")
	public void TestCase001(String username, String password )
	{
		
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
	//	driver.close();
	}

	@DataProvider(name ="data")
	public String[][] getData()
	{
		
		String[][] data = new String[3][2];
		
		data[0][0] ="DemoSalesManager";
		data[0][1] ="crmsfa";
		
		data[1][0] ="invalidUserName";
		data[1][1] ="invalidPassword";
		
		
		data[2][0] ="invalidUserName1";
		data[2][1] ="invalidPassword1";
		return data;
		
	}
	

	
}
