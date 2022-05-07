package seleniumBasics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OptionsBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("start-maximized");
		options.addArguments("headless");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("http://www.leafground.com/pages/sortable.html");
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();

	}

}
