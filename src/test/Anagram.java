package test;

public class Anagram {
	public static void main(String[] args) {
		String s1= " test a";
		String s2=" a";
		
		s1=s1.replaceAll("\\s", "");
		s2= s2.replaceAll("\\s", "");
		
		StringBuilder s = new StringBuilder(s2);
		System.out.println(s2);
		boolean flag= true;
			for(int i=0;i<s1.length();i++)
			{
				
				if(s.indexOf(""+s1.charAt(i))!=-1)
				{
					s=s.deleteCharAt(s.indexOf(""+s1.charAt(i)));
				}
				else
				{
					flag=false;
					break;
				}
					
			}
		
		
		if(flag)
			System.out.println("yes");
		else
			System.out.println("NO");
	}

}
