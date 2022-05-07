import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class TestCode {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		FileReader file = new FileReader(new File("C:\\Users\\NAGARAJU M\\Desktop\\MyTestDat.txt"));
		
		BufferedReader reader = new BufferedReader(file);
		String readLine2 = reader.readLine();
		String readLine = reader.readLine();
		readLine= reader.readLine();
		Map<String, Integer> map = new LinkedHashMap<>();
	//	int count =1;
//		while(readLine2!=null)
//		{
//			count++;
//			 readLine2= reader.readLine();
//			
//		}
	//	System.out.println(count);
		while(readLine!=null)
		{
			System.out.println(readLine);
			
			String[] columnSplit = readLine.split(",");
			
			for(int i=0;i<columnSplit.length;i++)
			{
				
				String id = columnSplit[0];
					Integer price = Integer.parseInt(columnSplit[3]);
					
					if(map.containsKey(id))
					{
						Integer priceToIncrease = map.get(id);
					//	System.out.println(priceToIncrease);
						map.put(id, (priceToIncrease+price));
					}
					else
						map.put(id, price);
					
					System.out.println(map);
					
			}
			
			
			readLine= reader.readLine();
			
		
			
		}
		
		System.out.println(map);

		
	}

}
