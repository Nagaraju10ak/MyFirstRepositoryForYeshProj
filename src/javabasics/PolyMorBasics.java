package javabasics;

public class PolyMorBasics {
	
	
	public void methodOne()
	{
		System.out.println("This is non-arg method");
	}
	
	public void methodOne(String name)
	{
		System.out.println("One arg method "+name);
	}
	
	public void methodOne(int num)
	{
		System.out.println("this is one arg method but int "+num);
	}
	
	public void methodOne(int num, String name)
	{
		System.out.println("this is two  arg method but int "+name +""+num);
	}
	
	public void methodTwo()
	{
		System.out.println("This is Parent method and without arg");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolyMorBasics obj = new Child1();
		
		obj.methodTwo();
	
		

	}
	
}
class Child1 extends PolyMorBasics
{
	
	public void methodTwo()
	{
		System.out.println("This is child method and without arg");
	}

}


