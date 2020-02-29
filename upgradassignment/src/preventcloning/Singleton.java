package preventcloning;

import singeleton.ThreadSafeSingleton;

public class Singleton extends CloneableParent{

	 private static Singleton instance;
	 
	    private Singleton() {
	    }
	 
	    // Thread T2, T3, T4 are waiting for T1 to release the lock
	    public static synchronized Singleton getInstance() {
	        // Thread T1 has taken the lock
	        if (instance == null) {
	            instance = new Singleton();  // Critical section
	        }
	        return instance;
	    }

		@Override
		protected Object clone() throws CloneNotSupportedException{
				throw new CloneNotSupportedException();
		}

}


