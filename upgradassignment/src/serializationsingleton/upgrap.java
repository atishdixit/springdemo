package serializationsingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;;

public class upgrap {

	public static void main(String args[]) throws IOException, ClassNotFoundException {
		 
	        SerializableSingleton instance1 = SerializableSingleton.getInstance();
	        ObjectOutput out = null;
	 
	        // Serialize object state to file
	        out = new ObjectOutputStream(
	        		new FileOutputStream("single.ser"));
	        out.writeObject(instance1);
	        out.close();
	 
	        // deserialize from file to object
	        ObjectInput in = 
	        		new ObjectInputStream(
	        				new FileInputStream("single.ser"));
	        
	        SerializableSingleton instance2 = 
	        		(SerializableSingleton) in.readObject();
	        in.close();
	 
	        System.out.println("instance1 hashCode = " + instance1.hashCode());
	        System.out.println("instance2 hashCode = " + instance2.hashCode());
	 
	  
	 
	}
}
