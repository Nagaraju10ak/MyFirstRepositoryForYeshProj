package seleniumBasics;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/");
		
		WebElement webWindow = driver.findElement(By.xpath("//h5[text()='Window']"));
		webWindow.click();
		driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
		
		Set<String> windows = driver.getWindowHandles();
		
		List<String> list = new ArrayList<>();
		
		list.addAll(windows);
		
		for(int i=1;i<list.size();i++)
		{
			String title = driver.switchTo().window(list.get(i)).getTitle();
			
			System.out.println(title);
			
			if(title.contains("Interact with HyperLinks"))
			{
				driver.switchTo().window(list.get(i));
				System.out.println(title);
				break;
			}
			
		}
		
		String two = driver.getTitle();
		System.out.println(two);
		
		driver.findElement(By.xpath("//a[text()='Go to Home Page']")).click();
		
		//driver.close();
		driver.quit();
		
		
		/*
		 * WebElement webWindow = driver.findElement(By.xpath("//h5[text()='Window']"));
		 * 
		 * webWindow.click();
		 * 
		 * driver.findElement(By.id("home")).click();
		 * 
		 * Set<String> windows = driver.getWindowHandles();
		 * 
		 * List<String> list = new ArrayList<>();
		 * 
		 * list.addAll(windows);
		 * 
		 * 
		 * for(int i=0;i<list.size();i++) {
		 * 
		 * String text =list.get(i);
		 * 
		 * System.out.println(text);
		 * 
		 * } driver.switchTo().window(list.get(1));
		 * 
		 * String title = driver.getTitle();
		 * 
		 * System.out.println(title);
		 */
	}

}
