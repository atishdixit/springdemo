
public class User {
	private String firstName;
	private String LastName;
	private String midName;
	private String state;
	private int pin;

	private User(UserBulder bulder) {
		this.firstName = bulder.firstName;
		this.LastName = bulder.LastName;
		this.midName = bulder.midName;
		this.pin = bulder.pin;
		this.state = bulder.state;
	}

	public static class UserBulder {

		private String firstName;
		private String LastName;
		private String midName;
		private String state;
		private int pin;

		public UserBulder(String firstName) {
			super();
			this.firstName = firstName;
		}

		public String getFirstName() {
			return firstName;
		}

		public UserBulder setFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public String getLastName() {
			return LastName;
		}

		public UserBulder setLastName(String lastName) {
			LastName = lastName;
			return this;
		}

		public String getMidName() {
			return midName;
		}

		public UserBulder setMidName(String midName) {
			this.midName = midName;
			return this;
		}

		public String getState() {
			return state;
		}

		public UserBulder setState(String state) {
			this.state = state;
			return this;
		}

		public int getPin() {
			return pin;
		}

		public UserBulder setPin(int pin) {
			this.pin = pin;
			return this;
		}

		public User build() {
			return new User(this);
		}

	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", LastName=" + LastName + ", midName=" + midName + ", state=" + state
				+ ", pin=" + pin + "]";
	}
}
