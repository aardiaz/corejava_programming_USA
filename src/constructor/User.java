package constructor;

public class User {
	
	//instance variable
	String username;
	String password;
	
	//---------- default constructor ----------
	User(){
		username = "admin";
		password = "1234";
	}
	
	//----------- parameterized constructor ---------
	User(String username, String password){
		this.username = username;
		this.password = password;
	}
	
	User(String username){
		this.username = username;
	}
	
	void printUser() {
		System.out.println("UserName = "+username);
		System.out.println("Password = "+password);
	}
	
	public static void main(String[] args) {
		
		User u = new User("Hari", "h678");
		u.printUser();
		
	}

}
