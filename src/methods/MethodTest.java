package methods;

public class MethodTest {

	public static void main(String[] args) {

		// add();
		// printTable(654);

//		int area = getArea();
//		volume(area, 20);

		System.out.println("Fact = "+factorial(5));
		reverse(4567);
		
		sumOfDigits(5000001);
		// System.out.println("Area = "+area);

//		int sv = findSmallestValue(35334, 655);
//		System.out.println("Smallest value = "+sv);
	}

	// 1. no return type with no arguments
	static void add() {

		int a = 4454;
		int b = 500;

		int s = a + b;
		System.out.println("Total = " + s);
	}

	// 2. no return type with arguments
	static void printTable(int n) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + (n * i));
		}
	}

//3. return type with no arguments
	static int getArea() {

		int l = 60;
		int b = 30;

		int ar = l * b;

		return ar;
	}

//4. return type with arguments
	static int findSmallestValue(int x, int y) {

		if (x < y) {
			return x;
		}
		return y;
	}

	static void volume(int area, int h) {
		
		int v = area * h;
		System.out.println("Area = " + area);
		System.out.println("Volume = " + v);
	}

	
	static int  factorial(int n) {
		
		 if(n == 0)
			 return 1;
		 else 
			return n*factorial(n-1);
		
	}
	
	static void reverse(int n) {
		
		// int q;
		 int r;
		 int rev = 0;
		
		 while(n > 0) {
			 r = n%10;
			 rev = rev*10+r;
			 n = n/10; 
		 }
		System.out.println(rev);
	}
	
	static void sumOfDigits(int n) {
		int total = 0;
		int r;
		
		while(n > 0) {
		  r = n%10;
		  total = total + r;
		  n = n/10;
		}
		
		System.out.println("Total = "+total);
	}
	
}






