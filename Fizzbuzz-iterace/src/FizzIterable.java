import java.util.Iterator;

public class FizzIterable implements Iterable<String> {
    @Override
    public Iterator<String> iterator() {
        return new FizzIterator();
    }
}
