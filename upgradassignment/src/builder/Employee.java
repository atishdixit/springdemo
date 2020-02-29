package builder;

public class Employee {
	
	private String firstName;
	private String midName;
	private String LastName;
	
	
	public String getFirstName() {
		return firstName;
	}
	public Employee setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}
	public String getMidName() {
		return midName;
	}
	public Employee setMidName(String midName) {
		this.midName = midName;
		return this;
	}
	public String getLastName() {
		return LastName;
	}
	public Employee setLastName(String lastName) {
		LastName = lastName;
		return this;
	}
	
	public static void main(String as[]) {
		Employee employee = new Employee();
		
		employee.setFirstName("Anil");
		employee.setMidName("Kumar");
		employee.setLastName("Dixit");
		
	
		new Employee()		
				.setFirstName("Anil")
				.setMidName("Kumar")
				.setLastName("Dixit");
			
		
	}
	
	
}
