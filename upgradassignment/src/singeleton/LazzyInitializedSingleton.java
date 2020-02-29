package singeleton;
public class LazzyInitializedSingleton {
 
    private static LazzyInitializedSingleton instance;
 
    private LazzyInitializedSingleton() {
 
    }
 
    // Lazy initialization is done when client first time request for the instance
    public static LazzyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazzyInitializedSingleton();
        }
        return instance;
    }
}