package javabasics;

import java.util.Scanner;


public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//PROGRAM TO EXECUTE CALC OPERATIONS
		
		Scanner scan = new Scanner(System.in);
		String operation = scan.nextLine(); //add,sub,mul,div
		
		System.out.println(operation);
		
		int num1 =20;
		int num2 =10;
		
		if(operation.equals("add"))
		{
		
		System.out.println(num1+num2);
		}
		else if(operation.equals("sub"))
		{
			System.out.println(num1-num2);
		}
		else if(operation.equals("mul"))
		{
			System.out.println(num1*num2);
		}
		else if(operation.equals("div"))
		{
			System.out.println(num1/num2);
		}
		else
		{
			System.out.println("ENTERED INVALID DETAILS");
		}
		
	}
	
	
	

}
