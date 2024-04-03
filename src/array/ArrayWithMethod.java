package array;

import java.util.Arrays;

public class ArrayWithMethod {
	
	/*
	 *  ------------- Array with method ---------------
	 *  a> Array as arguments   :
	 *      
	 *      void add(String a[]){
	 *      
	 *      }
	 *      
	 *      
	 *  b> Array as return type : 
	 *     
	 *       int[]   get20IntValue(){
	 *       
	 *         // array =  300,45,45,46,56,565,67,67,67,6,876,676,676,6767;  
	 *         return array;
	 *       }
	 *     
	 */
	
	public static void main(String[] args) {
		int[]  array =  {3,45,67,89,10,9,87,654,35,6,7,86,54};
		sum(array);
		
		int[]   odds = getOddNumsFrom1to100();
		System.out.println(Arrays.toString(odds));
	}
	
	
	//-------- array as arguments ---------------------
	
	static void  sum(int[]   values) {
		  int s = 0;
		  for(int x :  values) {
			  s += x;
		  }
		  
		  System.out.println("Total  = "+s);
	}
	
	//----------- array as return type ------------------
	
	static int[]   getOddNumsFrom1to100() {
		
		int  oddnums[] =  new int[50];
		int j = 0;
		
		for(int i=1; i<=100; i++) {
			
			  if(i%2 != 0) {
				  oddnums[j] = i;
				  j++;
			  }
		}
		
		return oddnums;
	}

}










