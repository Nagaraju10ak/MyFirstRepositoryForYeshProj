package seleniumBasics;

import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataRead_Parameterization {

	WebDriver driver;
	@DataProvider(name="data")
	public String[][] getExcelData() throws IOException
	{
		
		FileInputStream file = new FileInputStream("C:\\Users\\NAGARAJU M\\Desktop\\MyTestData.xlsx");
		
		XSSFWorkbook wBook = new XSSFWorkbook(file);
		
		XSSFSheet wSheet = wBook.getSheetAt(1);
		
		int rowsCount = wSheet.getLastRowNum();
		
		short columsCount = wSheet.getRow(0).getLastCellNum();
		System.out.println(columsCount);
		System.out.println(rowsCount);
		String[][] data = new String[rowsCount-1][columsCount];
		for(int i=1;i<rowsCount;i++)
		{
			for(int j=0;j<columsCount;j++)
			{
				
				XSSFRow row = wSheet.getRow(i);
				XSSFCell cell = row.getCell(j);
				data[i-1][j] = cell.getStringCellValue();
				System.out.println(data[i-1][j]);
			}
		}
		
		return data;
	}
	
	
	@BeforeSuite
	public void setPrerequsites()
	{
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		 

		 
	}
	@BeforeMethod
	public void setBrowser()
	{
		
		driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 
	}
	

	@Test(dataProvider = "data")
	public void TestCase001(String username, String password )
	{
		
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
	
		
	//	driver.close();
	}
}
