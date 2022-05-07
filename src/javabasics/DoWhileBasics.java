package javabasics;

public class DoWhileBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WAP to Print 1-10
		int var = myMethod();

	}
	public static int myMethod()
	{
		int i=1;
		
		
		do 
		{
			System.out.println(i);
			i++;
		}
		while(i<=10);
		
		
		return i;
		//i=1;1->2<=10
		//i=2;2->3<=10
	}
	
	
}
