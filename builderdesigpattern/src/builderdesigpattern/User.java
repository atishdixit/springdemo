package builderdesigpattern;

public class User {
	private int id;
	private String firstName;
	private String midName;
	private String lastName;
	private String state;
	private int pin;
	
	private User(UserBuilder builder) {
		this.id = builder.id;
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.state = builder.state;
		this.pin=  builder.pin;
	}

	public static class UserBuilder{
		private int id;
		private String firstName;
		private String midName;
		private String lastName;
		private String state;
		private int pin;
		
		UserBuilder(){
			
		}

		public UserBuilder setId(int id) {
			this.id = id;
			return this;
		}

		public UserBuilder setFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public UserBuilder setMidName(String midName) {
			this.midName = midName;
			return this;
		}


		public UserBuilder setLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}


		public UserBuilder setState(String state) {
			
			this.state = state;
			return this;
		}

		public UserBuilder setPin(int pin) {
			this.pin = pin;
			return this;
		}
		
		public User build() {
			return new User(this);
		}
		
	} 

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", midName=" + midName + ", lastName=" + lastName
				+ ", state=" + state + ", pin=" + pin + "]";
	}
	
}
