
public class BuilderTest {

	public static void main(String[] args) {
	User user = 	new User
		.UserBulder("Ajay")
		.setMidName("Kumar")
		.setLastName("Dixit")
		.setState("PB")
		.setPin(14401)
		.build();
	
	System.out.println(user);
	}

}
