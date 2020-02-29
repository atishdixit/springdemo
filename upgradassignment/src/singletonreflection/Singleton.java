package singletonreflection;

public class Singleton {


	private final static Singleton instance = new Singleton();
	
	//private static Singleton instance = new Singleton();

	private Singleton() {
		if (instance != null) {
			throw new IllegalStateException("Instance already created");
		}
	}

	
	
	public static synchronized Singleton getInstance() {
		return instance;
	}
}
