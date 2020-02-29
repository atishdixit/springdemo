package builder;

public class MainBuilder {

	public static void main(String arg[]) {
		User user = new User.UserBuilder()
				.setUsername("Aman")
				.setAge(25)
				.setEmail("asb@gmail.co")
				.build();
	
		
		User.UserBuilder builduser = new User.UserBuilder()
				.setUsername("Aman")
				.setAge(25)
				.setEmail("asb@gmail.co");
	
		
		User user2=  builduser.build();
		
				
//	            .setUsername("Ajay")
//	            .setAge(26)
//	            .setEmail("ajay@exa.com")
//	            .build();
//		
		System.out.println(user);
	}
}
