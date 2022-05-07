package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		WebElement alertButton = driver.findElement(By.xpath("//button[text()='Alert Box']"));
		alertButton.click();
		Alert alert = driver.switchTo().alert();
		
		alert.accept(); //OK button clicked
		
		WebElement alertButton2 = driver.findElement(By.xpath("//button[text()='Confirm Box']"));
		alertButton2.click();
		alert.dismiss(); //CANCEL button clicked
		
		WebElement promptAlert = driver.findElement(By.xpath("//button[text()='Prompt Box']"));
		promptAlert.click();
		
		alert.sendKeys("My Test");
		String text = alert.getText();
		alert.accept();
		
		System.out.println(text);
		
		
		
		
		
	}

}
