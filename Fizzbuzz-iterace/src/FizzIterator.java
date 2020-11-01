import java.util.Iterator;

public class FizzIterator implements Iterator<String> {
    private int counter = 0;

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public String next() {
        counter++;
        try {
            Thread.sleep(228);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if ((counter % 3 == 0) && (counter % 5 == 0))
            return "Fizz-Buzz ";
        else if (counter % 5 == 0)
            return "Buzz ";
        else if (counter % 3 == 0)
            return "Fizz ";
        else return counter + " ";
    }
}
