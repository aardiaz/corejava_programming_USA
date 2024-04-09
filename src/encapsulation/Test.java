package encapsulation;

public class Test {
	
	public static void main(String[] args) {
		
		Customer c = new Customer();
		
//		c.id=343;
//		c.name = "Hari";
//		c.age = 30;
//		c.city = "Kathmandu";
		
		c.setId(3434);
		c.setName("Roman");
		c.setAge(40);
		c.setCity("Ktm");
		
		System.out.println(c);

//		System.out.println("Id = "+c.getId());
//		System.out.println("Name = "+c.getName());
//		System.out.println("Age = "+c.getAge());
//		System.out.println("City = "+c.getCity());
	}

}
