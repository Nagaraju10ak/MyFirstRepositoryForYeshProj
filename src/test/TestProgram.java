package test;

public class TestProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name ="This is myself nagaraj";
		
		char[] myChars = new char[name.length()];;
		
		
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)==' ')
			{
				myChars[i]=' ';
			}
		}
		System.out.println(myChars);
		int j= name.length()-1;
		System.out.println(j);
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)!=' ')
			{
			if(myChars[j]==' ')
			{
				
				j--;
			}
				myChars[j]=name.charAt(i);
				j--;
			}
			
		}
		
		//System.out.println(myChars);
		for(int i=0;i<myChars.length;i++)
		{
			System.out.print(myChars[i]);
		}
	}

}
