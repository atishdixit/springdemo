package singeleton;







public class TestSingleton {
	public static void main(String as[]) {
		LazzyInitializedSingleton initializedSingleton = LazzyInitializedSingleton.getInstance();
		LazzyInitializedSingleton initializedSingleton1 = LazzyInitializedSingleton.getInstance();
		
		System.out.println(initializedSingleton.hashCode());
		System.out.println(initializedSingleton1.hashCode());
		
	}
}
