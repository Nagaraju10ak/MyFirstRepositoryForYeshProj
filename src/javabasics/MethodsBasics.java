package javabasics;

public class MethodsBasics {

	public MethodsBasics(String pass)
	{
		System.out.println("This is contrcutor    "+pass);
	}
	
	
	public  int myOperation()
	{
		int num1=10;
		int num2=20;
		System.out.println(num1+num2);
		int sum = num1+num2;
		return sum;
	}
	
	public  void myOperationSub(int first, int second)
	{
		System.out.println(first-second);
	}
	
	public  String myOperationReturn(String one, String two)
	{
		String finalword = one+two;
		
		return finalword;
	}



}
