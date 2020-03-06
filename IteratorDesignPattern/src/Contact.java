import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Contact<T> implements Iterable<T> {

	private final List<T> elements;
	
	public Contact(List<T> elements){
		this.elements = elements;
	}
	
	@Override
	public Iterator<T> iterator() {
		return this.elements.iterator();
	}
	
	public static void main(String as[]) {
		List<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("Hello1");
		list.add("Hello2");
		list.add("Hello3");
		list.add("Hello4");
		list.add("Hello5");

		Contact<String> contact = new Contact<>(list);
		
		for(String str: contact) {
			System.out.println(str);
		}
	}

}
