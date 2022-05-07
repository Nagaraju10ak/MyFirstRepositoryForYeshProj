package seleniumBasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties prop = new Properties();
		
		FileInputStream file = new FileInputStream("./myTest.properties");
		
		prop.load(file);
		
		String property = prop.getProperty("browser");
		String property2 = prop.getProperty("name");
		
		System.out.println(property);
		System.out.println(property2);

	}

}
