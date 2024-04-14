package javacollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
	
	public static void main(String[] args) {
		
		//List<String> list = new ArrayList<>(); 
		List<String> list = new LinkedList<>();
//		List<Student> list = new ArrayList<>(); 
//		   Student s1 = new Student();
//		   s1.setId(4545);
//		   s1.setName("hari");
//		   
//		   list.add(s1);
		
		  list.add("nepal");
		  list.add("japan");
		  list.add("canada");
		  list.add("us");
		  list.add("india");
		  
		  list.remove(2);
		  list.remove("japan");
		  System.out.println(list.contains("us"));
		  list.clear();
		  
		  for(String s : list ) {
			  System.out.println(s);
		  }
		
		  /*
		   * 1> List of Student 
		   * 2> List of Book
		   */
	}

}
