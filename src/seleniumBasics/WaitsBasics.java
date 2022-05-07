package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/TextChange.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		/*
		 * driver.findElement(By.xpath("//h5[text()='Wait for Alert']")).click(); //20
		 * -> 5th sec locator loaded in DOM (20 sec)
		 * 
		 * driver.findElement(By.id("alert")).click();
		 * 
		 * 
		 * 
		 * wait.until(ExpectedConditions.alertIsPresent());
		 * 
		 * 
		 * Alert alert = driver.switchTo().alert();
		 * 
		 * alert.accept();
		 */
		
		
		WebElement webBtn = driver.findElement(By.id("btn"));
		
		wait.until(ExpectedConditions.textToBePresentInElement(webBtn, "Click ME!"));
	}

}
