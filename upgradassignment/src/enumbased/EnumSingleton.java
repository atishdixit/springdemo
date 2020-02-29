package enumbased;

public class EnumSingleton {
	
	

	public static void main(String as[]) {
		System.out.println(Singleton.INSTANCE.hashCode());
		System.out.println(Singleton.INSTANCE.hashCode());
	}
}
