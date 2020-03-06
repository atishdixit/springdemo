import java.util.Iterator;
import java.util.Set;

class Family<E> implements Iterable<E> {
    private final Set<E> elements;
  
    public Family(Set<E> elements) {
        this.elements = elements;
    }
    
    @Override
    public Iterator<E> iterator() {
        return elements.iterator();
    }
}