package polymorphism;

public class MethodOverLoadingTest {
	
	void sum(int a, int b) {
		int c = a + b;
		System.out.println("sum ="+c);
	}

	void sum(int x, int y, int z) {
		int s = x + y+ z;
		System.out.println("Sum = "+s);
	}
	
	void sum(float a, int b) {
		float s = a + b;
		System.out.println("Sum = "+s);
	}
	
	public static void main(String[] args) {
		MethodOverLoadingTest  mt = new MethodOverLoadingTest();
		mt.sum(434, 877);
		mt.sum(887, 8778, 9898);
		mt.sum(343.545f, 9000);
		
	}
}
