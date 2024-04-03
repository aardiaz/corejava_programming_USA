package controlstm.looping;

public class EnhanceTest {
	
	/*
	 * --------------- Enhance for loop ---------------------------
	 *   # use to read data from collection(array,list,set,map)
	 *   
	 *    syntax :
	 *    
	 *       for(data_type  var : collection){
	 *           //statements
	 *       }
	 */

	  public static void main(String[] args) {
		
		  int values[] =  {4,56,78,90,9,8,97,6,54,35,6,78};
		  int s = 0;
		  
		  for(int x : values) {
			  System.out.println(x);
			  s = s + x;
		  }
		  System.out.println("Total = "+s);
	}
}
