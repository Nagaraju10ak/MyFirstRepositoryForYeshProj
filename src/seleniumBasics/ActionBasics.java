package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.leafground.com/pages/sortable.html");

		Actions act = new Actions(driver);

		// Move to ElementMy changes uptade

		/*
		 * driver.findElement(By.xpath("//h5[text()='Tool Tip']")).click();
		 * 
		 * WebElement webTxtBox = driver.findElement(By.id("age"));
		 * 
		 * 
		 * 
		 * act.moveToElement(webTxtBox).perform();
		 */

		// Drag and Drop by coordinates and source/destination

		/*
		 * WebElement webDrag =
		 * driver.findElement(By.xpath("//p[text()='Drag me around']"));
		 * 
		 * act.dragAndDropBy(webDrag, 200, 300).perform();
		 */

		/*
		 * WebElement webSource = driver.findElement(By.id("draggable")); WebElement
		 * webDes = driver.findElement(By.id("droppable")); act.dragAndDrop(webSource,
		 * webDes).perform();
		 */

		// SORTABLE

		/*
		 * WebElement webSort = driver.findElement(By.
		 * xpath("(//li[@class='ui-state-default ui-sortable-handle'])[1]")); WebElement
		 * webSort1 = driver.findElement(By.
		 * xpath("(//li[@class='ui-state-default ui-sortable-handle'])[3]"));
		 * act.clickAndHold(webSort).moveToElement(webSort1).perform();
		 */

		WebElement webItem1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement webItem3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement webItem5 = driver.findElement(By.xpath("//li[text()='Item 5']"));
		
		
		act.click(webItem1).keyDown(Keys.CONTROL).click(webItem3).click(webItem5).release().perform();

	}

}
