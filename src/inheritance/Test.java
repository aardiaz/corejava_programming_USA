package inheritance;

public class Test {
	
	public static void main(String[] args) {
		
		Programmer  p = new Programmer();
		
		p.id = 3434;
		p.name = "Bishnu";
		p.company = "Google";
		p.salary = 800000;
		p.bonus = 50000;
		p.progLang = "Java";
		p.project = "G-Earth";
		
		p.print();
	}

}
