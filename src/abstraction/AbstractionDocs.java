package abstraction;

public class AbstractionDocs {
	
	/*
	 * ----------------------- Abstraction -----------------------------------
	 *   # process of hiding implementation details in the program.
	 *   # To achieve abstraction :
	 *    
	 *    a> Abstract class :
	 *       # class which contains abstract methods(unimplemented) 
	 *         and non-abstract methods(implemented) is known as abstract class.
	 *    
	 *            #Abstract method :
	 *              -> method which does not have body/implementation details
	 *                 is known as abstract method.
	 *                 
	 *                 e.g.
	 *                    abstract void  print();
	 *                    abstract int getArea(int l, int b);
	 *                    
	 *          # we cant create object.
	 *          # every abstract class must have at least one child class
	 *            and child class must override abstract methods.
	 *            
	 *          # level of abstraction 0-100%   
	 *                    
	 *                    
	 *                  syntax :
	 *                  abstract class class_name{
	 *                      
	 *                        //abstract methods
	 *                        
	 *                          e.g.   abstract void sum();
	 *                        
	 *                        //non-abstract methods
	 *                         e.g.
	 *                            void print(){
	 *                            
	 *                            }
	 *                    }
	 *                    
	 *                    
	 *    b> Interface :
	 *      # same as class which contains public abstract methods and public static final 
	 *        variables is known as interface.
	 *        
	 *      # we cant create object
	 *      # every interface must have at least one implementation class and impl. class
	 *        must override abstract methods.
	 *        
	 *      # level of abstraction 100%
	 *      
	 *           # syntax :
	 *             
	 *             interface   interface_name{
	 *             
	 *                //public  abstract methods
	 *                
	 *             }
	 *             
	 *             
	 *             
	 *             ----------------------------------------
	 *             class      extends      class
	 *             interface  extends      interface
	 *             class      implements   interface
	 *             
	 */

}
