package javabasics;

import java.util.Scanner;

public class SwitchBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		String operation = scan.nextLine();
		int num1 = 20;
		int num2 =10;
		
		switch(operation) {
		
		case "add":
			
			System.out.println(num1+num2);break;
			
		case "sub":
			
			System.out.println(num1-num2); break;
			
		case "mul":
			
			System.out.println(num1*num2); break;
			
		case "div":
			
			System.out.println(num1/num2); break;
		default:
			System.out.println("INVALID OPERATION");
			
			
		
		}

	}

}
