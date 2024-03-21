package datatype;

import java.util.Scanner;

public class VaribleTest {
	
	/*
	 * ------------------- Variable ---------------------
	 * # use to store data/value.
	 * # data stored for data processing.
	 * 
	 * # Syntax :
	 * 
	 *     data_type   variable_name;
	 */
	
   public static void main(String[] args) {
		
		  //WAP to find area of rectangle.
	       int l ;
	       int b ;
	       
	       //get/read value form user/keyboard
	       Scanner  sc = new Scanner(System.in);
	       
	       System.out.println("Enter value of l ");
	       l = sc.nextInt();
	       
	       System.out.println("Enter value of b ");
	       b = sc.nextInt();
	       
	       
	       int ar = l * b;
	       System.out.println("Area = "+ar);
		  
	}

}






