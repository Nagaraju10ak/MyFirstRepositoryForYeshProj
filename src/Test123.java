import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.MatchesPattern;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test123 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		String input = "([])){}}]";
//		
//		Map<Character, Integer> map = new LinkedHashMap<>();
//		
//		for(int i=0;i<input.length();i++)
//		{
//			
//			if(map.containsKey(input.charAt(i)))
//					{
//						int count = map.get(input.charAt(i));
//						map.put(input.charAt(i), count+1);
//					}
//			
//			else
//				map.put(input.charAt(i), 1);
//		}
//		
//		System.out.println(map);
//		
//		int countOpenPar =0;
//		int countClosedPar = 0;
//		
//	//	map. 
//		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//			Character key = entry.getKey();
//			Integer val = entry.getValue();
//			
//			
//			if(key.equals('('))
//				countOpenPar=val;
//			else if(key.equals(')'))
//				countClosedPar =val;
//			
//			
//		}
//		
//		
//		if(countClosedPar!=countOpenPar)
//			System.out.println("Invalid count for no of paranthesis");
//	
		
		
		
	//	String file = new FileInputStream("C:\\Users\\NAGARAJU M\\Desktop\\TestFile.txt");
		
		Stack<Character> stack = new Stack<>();
		
		String name ="([]{[})";
		
		for(int i=0;i<name.length();i++)
		{
			
			if(name.charAt(i)=='{'|| name.charAt(i)=='(' || name.charAt(i)=='[')
				stack.push(name.charAt(i));
			
			else if(!stack.empty() && 
						(name.charAt(i)=='}' && stack.peek()=='{') || 
						(name.charAt(i)==']' && stack.peek()=='[') ||
					(name.charAt(i)==')' && stack.peek()=='('))
			{
				
				stack.pop();
			}
				
				else
					stack.push(name.charAt(i));
		}		
		
		
			if(stack.isEmpty()==false)
				System.out.println("Invalid");
			else
				System.out.println("valid");
		
		}

}
