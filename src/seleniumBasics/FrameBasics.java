package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  //findElement, findElements
		
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("//h5[text()='Frame']")).click();
//		WebElement frameWeb = driver.findElement(By.xpath("//div[@id='wrapframe']/iframe[@src='default.html']"));
//		driver.switchTo().frame(frameWeb);
//		
//		driver.findElement(By.id("Click")).click();
//		driver.switchTo().defaultContent();
//		String text = driver.findElement(By.xpath("//h1[@class='wp-heading']")).getText();
//		System.out.println(text);
		WebElement framWeb2 = driver.findElement(By.xpath("//div[@id='wrapframe']/iframe[@src='page.html']"));
		driver.switchTo().frame(framWeb2);
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click1")).click();
	}

}
