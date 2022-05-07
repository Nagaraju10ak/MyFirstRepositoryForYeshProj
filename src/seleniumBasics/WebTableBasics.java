package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/table.html");
		
		WebElement table = driver.findElement(By.xpath("//div[@id='contentblock']//div/table/tbody"));
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
				
		
		
		
		
		
		
		
		
		
		for(int i=1;i<rows.size();i++)
		{
			WebElement row1 = rows.get(i);
			List<WebElement> columns = row1.findElements(By.tagName("td"));
			
			
			for(int j=0;j<columns.size();j++)
			{
				
				WebElement column = columns.get(j);
				System.out.println(column.getText());
				
			}
		}
	}

}
