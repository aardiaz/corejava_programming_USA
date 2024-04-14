package javacollection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
	
	public static void main(String[] args) {
		//subject  - marks
		//Map<String, Integer>  map = new HashMap<>();
		//Map<String, Integer>  map = new TreeMap<>();
		Map<String, Integer>  map = new LinkedHashMap<>(); 
		
		map.put("Math", 90);
		map.put("Science", 80);
		map.put("Nepali", 88);
		map.put("Computer", 95);
		
		for(String key : map.keySet()) {
			System.out.println(key+" = "+map.get(key));
		}
		
	}

}
