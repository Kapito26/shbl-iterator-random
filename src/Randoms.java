import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int dif;
    protected int beg;

    public Randoms(int min, int max) {
        dif = max - min + 1;
        beg = min;
        iterator().next();
    }

    //   @NotNull
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {


            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                random = new Random();
                return random.nextInt(dif) + beg;
            }
        };
    }
}
