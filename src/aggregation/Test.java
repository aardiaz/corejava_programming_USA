package aggregation;

public class Test {
	
	public static void main(String[] args) {
		Car c = new Car();
		
		c.setColor("Blue");
		c.setCompany("Tesla");
		c.setCc(4000);
		c.setPrice(4500000);
		
		Employee  emp = new Employee();
		
		emp.setId(3434);
		emp.setName("Kamal Giri");
		emp.setCity("Kathmandu");
		emp.setSalary(700000);
		emp.setCar(c);
		
		System.out.println("Id = "+emp.getId());
		System.out.println("Name = "+emp.getName());
		System.out.println("Salary = "+emp.getSalary());
		System.out.println("-------- car info -------");
		System.out.println("Color = "+emp.getCar().getColor());
		System.out.println("Price = "+emp.getCar().getPrice());
		System.out.println("Company = "+emp.getCar().getCompany());
		System.out.println("cc = "+emp.getCar().getCc());
		
	}

}
