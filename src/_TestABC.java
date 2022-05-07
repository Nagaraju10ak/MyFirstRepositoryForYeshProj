import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class _TestABC {
	private static int $;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String h_e;
		//System.out.println(h_e);
		System.out.println($);
		String input = "AAaaC3NzaC1lZDI1NTE5AAAA";
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		ArrayList lis1 = new ArrayList();
		lis1.add(Boolean.TRUE);
		System.out.println(lis1);
		for(int i=0;i<input.length();i++)
		{
			char charAt = input.charAt(i);
			if(Character.isAlphabetic(charAt)) {
				 charAt = Character.toUpperCase(charAt);
			}
			if(map.containsKey(charAt))
					{
						int num = map.get(charAt);
						map.put(charAt, num+1);
					}
			
			else
				map.put(charAt, 1);
			
		}
		int count =0;
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		System.out.print("Numbers in the given string are  ");
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			Character key = entry.getKey();
			Integer val = entry.getValue();
			
			if(key.equals('A')||key.equals('a'))
				count = count+entry.getValue();
			
			if(Character.isDigit(key))
				System.out.println("  "+entry.getKey());
			
		}
		System.out.println("MAP IS   "+map);
		System.out.println("COUNT OF A's are "+count);
	}

}
