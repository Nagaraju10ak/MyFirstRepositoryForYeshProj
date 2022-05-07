package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNgBasics2 {

	@Test(groups= {"regression"}, dependsOnGroups = {"smoke"})
	public void myTest2()
	{
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/");
		
		WebElement webWindow = driver.findElement(By.xpath("//h5[text()='Window']"));
		webWindow.click();
		driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
	}
}
