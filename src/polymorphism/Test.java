package polymorphism;

public class Test {
	
	public static void main(String[] args) {
		
		//static or early binding of object
		LaxmiBank  lb = new LaxmiBank();
		
		lb.getBankName();
		lb.getInterestRate();
		
		//up-casting
		CentralBank b = new PrabhuBank();
		printBank(b);
	}
	
    //dynamic binding or late binding of object
	// runtime polymorphism
	static void printBank(CentralBank cb) {
		
		cb.getBankName();
		cb.getInterestRate();
	}
	
}
