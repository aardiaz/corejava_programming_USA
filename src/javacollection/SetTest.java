package javacollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
	
	public static void main(String[] args) {
		
		//Set<String>  set = new HashSet<>();
		//Set<String>  set = new TreeSet<>();
		Set<String>  set = new LinkedHashSet<>();
		
		set.add("Hari");
		set.add("Ram");
		set.add("Kamal");
		set.add("Hari");
		set.add("Anup");
		set.add("Prabin");
		set.add("Kamal");
		set.add("Rupesh");
		
		for(String s : set) {
			System.out.println(s);
		}
		
	}

}
