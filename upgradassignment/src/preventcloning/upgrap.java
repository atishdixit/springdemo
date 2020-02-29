package preventcloning;

public class upgrap {

	public static void main(String[] args) {
	
		Singleton singleton=Singleton.getInstance();
		
		System.out.println(singleton.hashCode());
		try {
			System.out.println(singleton.clone());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
