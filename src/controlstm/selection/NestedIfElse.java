package controlstm.selection;

public class NestedIfElse {
	
	/*
	 *   ----------- nested if-else ------------
	 *   
	 *    syntax :
	 *    
	 *       if(condition-1){
	 *       
	 *          if(condition-2){
	 *             ................
	 *             ..............
	 *             .....................
	 *          }else{
	 *          
	 *          }
	 *       
	 *       }else{
	 *       
	 *       }
	 */
	
	public static void main(String[] args) {
		
		  String citizen = "nepali";
		  int age = 30;
		  boolean voterId = true;
		  
		    if(citizen.equals("nepali")) {
		    	
		    	  if(age >= 18) {
		    		   
		    		   if(voterId) {
		    			   System.out.println("You can vote");
		    		   }else {
		    			   System.out.println("You dont hv voter id");
		    		   }
		    		  
		    	  }else {
		    		  System.out.println("you are under age");
		    	  }
		    	
		    }else {
		    	System.out.println("invalid citizen");
		    }
		
	}

}






