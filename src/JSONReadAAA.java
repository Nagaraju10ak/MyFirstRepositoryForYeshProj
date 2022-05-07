import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.json.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class JSONReadAAA {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		
		FileReader file = new FileReader("C:\\Users\\NAGARAJU M\\Desktop\\MyData.json");
			
		JSONParser parse= new JSONParser();
		
		Object parser = parse.parse(file);
		
		JSONObject obj =(JSONObject) parser;
		
		String object = (String) obj.get("firstName");
		
		System.out.println(object);
			
		
		Map map = (Map) obj.get("address");
		
		
		Iterator iterator = map.entrySet().iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		org.json.simple.JSONArray object2 =  (org.json.simple.JSONArray) obj.get("phoneNumbers");
		
		Iterator<Object> iterator2 = object2.iterator();
		
		while(iterator2.hasNext())
		{
			
			Iterator iterator3 = ((Map) iterator2.next()).entrySet().iterator();
			
			while(iterator3.hasNext())
			{Map.Entry pair  = (Entry) iterator3.next();
			System.out.println(pair.getKey() + " : " + pair.getValue());
			}
		}
	}

}
