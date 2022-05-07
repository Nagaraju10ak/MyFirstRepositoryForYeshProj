package seleniumBasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionBasics {

	
	public static void main(String[] args)   {
		
		try {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/");
		
		WebElement webWindow = driver.findElement(By.xpath("//h5[text()='Window']"));
		webWindow.click();
		driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
		
		Set<String> windows = driver.getWindowHandles();
		
	
			
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			
			System.out.println("This is my catch block");
			e.printStackTrace();
		}
		
		finally
		{
			System.out.println("This is my finally block");
		}
		
		
		
		
		
	}
}
