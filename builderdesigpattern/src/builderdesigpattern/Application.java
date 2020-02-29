package builderdesigpattern;

public class Application {

	public static void main(String[] args) {
	User.UserBuilder user = new User.UserBuilder()
	.setFirstName("Rahul")
	.setMidName("Kumar");
	
	System.out.println("Hello Mo1");
	
	
	user.setLastName("Dixit")
	.setState("PB"); 
	
	System.out.println("hhh");
	user.setPin(144001)
	.setId(10001);
	
	System.out.println("jfdkj");
	User u = user.build();
	
	System.out.println("User Detail : "+user);
	
	}

}
