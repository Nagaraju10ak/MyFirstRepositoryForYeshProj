import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestVID {
	
	//names = ab , bc, cd, ab, bc
	//email = ab@gamil.com, ab1@gmail.com, bc@gmail.com, bc1@gmail.com
	
	public static void main(String[] args) {
		
		//ab -2 , bc -2, cd-1
		//count -1  - name@gmail
		//count -2 - name+count-1@gmail.com
		
		String[] names ={"ab" , "bc", "cd", "ab","ab", "bc"};
		
		Map<String, Integer> map = new LinkedHashMap<>();
		String emailId=null;
		for(int i=0;i<names.length;i++)
		{
			
			if(map.containsKey(names[i]))
			{
				int count = map.get(names[i]);
				map.put(names[i], count+1);
				emailId=names[i]+(count+1)+"@gmail.com";
				System.out.println(emailId);
			}
			else
			{
				map.put(names[i], 0);
				
				emailId=names[i]+"@gmail.com";
				System.out.println(emailId);
			}
			
		}
		
		System.out.println(map);
		
	
		
		
		
		/*
		 * for (Map.Entry<String, Integer> entry : map.entrySet()) { String key =
		 * entry.getKey(); Integer val = entry.getValue(); if(val!=0) {
		 * emailId=key+"@gmail.com"; // System.out.println(emailId); for(int
		 * j=1;j<=val;j++) { emailId=key+j+"@gmail.com"; // System.out.println(emailId);
		 * } } else { emailId=key+"@gmail.com"; // System.out.println(emailId); }
		 * 
		 * }
		 */
	}

}
