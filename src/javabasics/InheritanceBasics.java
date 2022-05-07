package javabasics;

public class InheritanceBasics {

	
	
	public void parentMethod()
	{
		
		System.out.println("This is in parent method");
	}
	
	public void parentMethodWithArg()
	{
		
		System.out.println("Parent another method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child obj = new Child();
		
		obj.parentMethod();
		obj.childMethod();
	}
	

}
class InheritanceBasics2 {

	
	
	public void parentMethod1()
	{
		
		System.out.println("This is in parent method");
	}
	
	public void parentMethodWithArg1()
	{
		
		System.out.println("Parent another method");
	}
	
	

}




class Child extends InheritanceBasics
{
	
	
	
	
	public void childMethod()
	{
		
		System.out.println("This is in child method");
	}
	
	public void childMethodArg()
	{
		
		System.out.println("child another method");
	}
	
	
	
	
}
