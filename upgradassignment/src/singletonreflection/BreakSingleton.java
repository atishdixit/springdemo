package singletonreflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class BreakSingleton {

	public static void main(String as[]) {

		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = null;

		
		try {
			Field field = Singleton.class
					.getDeclaredField("instance");
			field.setAccessible(true);
			field.set(field, null);
			
			
			Constructor constructor = Singleton.class
					.getDeclaredConstructor();
			constructor.setAccessible(true);
			singleton2 = (Singleton) constructor.newInstance();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("singleton-: "+singleton.hashCode());
		System.out.println("singleton1-: "+singleton2.hashCode());
			
	}
	
}
