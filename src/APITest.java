import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class APITest {

	String name="Chandra Nambeesan";
	
	String email="nambeesan_chandra@schmitt.com";
	
	
	public String getName()
	{
		return this.name;
		
	}
	
	public void setName(String name)
	{
		  this.name=name;
		
	}
	
	public String getemail()
	{
		return this.email;
		
	}
	
	public void setemail(String email)
	{
		  this.email=email;
		
	}
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String url="https://gorest.co.in/public/v2/users";
		
		
		APITest objAPI = new APITest();
		
		System.out.println(objAPI.getName());
		objAPI.setName("abc");
		System.out.println(objAPI.getName());
		
		verifyAPIEndPoint(url);
		
		
		
		

	}
	
	public static void verifyAPIEndPoint(String url) throws IOException
	{
		URL urlToTest = new URL(url);
		
		HttpsURLConnection connection = (HttpsURLConnection) urlToTest.openConnection();
		
		connection.setConnectTimeout(2000);
		//connection.
		connection.connect();
		//connection.
		int responseCode = connection.getResponseCode();
		String responseMessage = connection.getResponseMessage();
		
		//connection.
		System.out.println(responseMessage);
	}

}
