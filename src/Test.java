import org.testng.annotations.Parameters;

public class Test {
	
	
	@org.testng.annotations.Test
	@Parameters({"userName","password"})
	public void test(String userName, String password)
	{
		
		
		System.out.println(userName);
		System.out.println(password);
	}

}
