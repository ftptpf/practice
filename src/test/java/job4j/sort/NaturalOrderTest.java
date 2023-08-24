package job4j.sort;

import org.junit.Test;
import ru.practice.job4j.sort.NaturalOrder;

import java.util.Comparator;
import static org.junit.Assert.*;

public class NaturalOrderTest {

    @Test
    public void test() {
        assertEquals(Comparator.naturalOrder(), NaturalOrder.naturalOrder());
    }
}