package javabasics;

public class MethodBasics {

	
	
	int num =10;
	String name ="testname";
	
	public void myMethod()
	{
		System.out.println("my method");
	}

	public void secondMethod()
	{
		System.out.println("my second method");
	}
	
	
	public int paramMethod(int num1, int num2)
	{
		System.out.println(num1+num2);
		return num1+num2;
	}
	
	
	public MethodBasics(int num)
	{
		System.out.println("This is contrctor"+num);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		MethodBasics obj = new MethodBasics(1);
		
	}
	
}
