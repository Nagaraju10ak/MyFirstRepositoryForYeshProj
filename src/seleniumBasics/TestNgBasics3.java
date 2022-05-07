package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNgBasics3 {
	  @Test(groups = {"smoke"} , timeOut = 1000)
	  public void myTestTest() {
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			
			//LOGIN OPERATION
				driver.get("http://leaftaps.com/opentaps/control/main");
			
			
			WebElement userNameWeb =driver.findElement(By.id("username"));
			userNameWeb.sendKeys("DemoSalesManager");
			
			WebElement passwordWeb = driver.findElement(By.id("password"));
			passwordWeb.sendKeys("crmsfa");
			
			WebElement loginWeb = driver.findElement(By.xpath("//input[@type='submit']"));
			loginWeb.click();
			
			//LOGIN INTO CRM/SFA
			
			WebElement crmsfaLogin = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]"));
			
			crmsfaLogin.click();
			
			WebElement createLeadWeb = driver.findElement(By.xpath("//a[text()='Create Lead']"));
			createLeadWeb.click();
	  }

}
