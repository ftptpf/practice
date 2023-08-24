package other;

import org.junit.Test;
import ru.practice.other.arrayDoubleIterator;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class arrayDoubleIteratorTest {

    @Test
    public void when4El() {
        int[][] in = {
                {1}
        };
        arrayDoubleIterator it = new arrayDoubleIterator(in);
        assertThat(it.next(), is(1));
    }
    @Test
    public void whenFirstEmptyThenNext() {
        int[][] in = {
                {}, {1}
        };
        arrayDoubleIterator it = new arrayDoubleIterator(in);
        assertThat(it.next(), is(1));
    }
}