package seleniumBasics;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MyParam {

	
	@Test(dataProvider = "fetchData")
	
	public void myTest(String userName, String password)
	{
		System.out.println(userName);
		System.out.println(password);
		
		System.out.println("ABC");
	}
	@DataProvider(name="fetchData")
	public String[][] myTest1() throws IOException{
		
		FileInputStream file = new FileInputStream("C:\\\\Users\\\\NAGARAJU M\\\\Desktop\\\\testData.xlsx");
		
	XSSFWorkbook xbook = new XSSFWorkbook(file);
	XSSFSheet xSheet = xbook.getSheetAt(1);
	int rows = xSheet.getLastRowNum();
	
	short columns = xSheet.getRow(0).getLastCellNum();
	String[][] stringCellValue = new String[rows-1][columns];
	
	for(int i=1;i<rows;i++)
	{
		for(int j=0;j<columns;j++)
		{
			XSSFRow row = xSheet.getRow(i);
			XSSFCell cell = row.getCell(j);
			 stringCellValue[i-1][j] = cell.getStringCellValue();
			System.out.println(stringCellValue);
		}
	}
	
	
	return stringCellValue;
		
	}
}
