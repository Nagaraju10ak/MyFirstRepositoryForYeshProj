package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownBasicWithoutSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infosys");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("FirstName");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("LastName");
		
		
		WebElement sourceDrpDwn = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		List<WebElement> options = sourceDrpDwn.findElements(By.tagName("option"));
		
		for(int i=0;i<options.size();i++)
		{
			String text = options.get(i).getText();
			System.out.println(text);
		}
	}

}
