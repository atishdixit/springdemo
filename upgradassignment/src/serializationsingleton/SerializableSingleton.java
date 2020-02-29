package serializationsingleton;
import java.io.Serializable;
 
public class SerializableSingleton implements Serializable{
 
    private static final long serialVersionUID = 1L;

        private static SerializableSingleton instance = new SerializableSingleton();
 
        private SerializableSingleton() {
            System.out.println("Constructor is being called");
        }
 
        public static SerializableSingleton getInstance() {
            return instance;
        }
        
       protected Object readResolve() {
        	return getInstance();
        }

       
       
       
       
}