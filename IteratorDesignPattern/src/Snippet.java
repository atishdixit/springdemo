import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Snippet {
	    public static void main(String[] args) {
	        Set<String> weasleys = new HashSet(Arrays.asList(
	            "Arthur", "Molly", "Bill", "Charlie",
	            "Percy", "Fred", "George", "Ron", "Ginny"
	            ));
	        Family<String> family = new Family<>(weasleys);
	    
	        for (String name : family) {
	            System.out.println(name + " Weasley");
	        }
	    }
}