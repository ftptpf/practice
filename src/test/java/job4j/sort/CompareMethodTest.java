package job4j.sort;

import org.junit.Test;
import ru.practice.job4j.sort.CompareMethod;

import static org.junit.Assert.*;

public class CompareMethodTest {

    @Test
    public void testAscending() {
        assertEquals(0, CompareMethod.ascendingCompare(1, 1));
        assertEquals(-1, CompareMethod.ascendingCompare(1, 2));
        assertEquals(1, CompareMethod.ascendingCompare(2, 1));
    }

    @Test
    public void testDescending() {
        assertEquals(0, CompareMethod.descendingCompare(1, 1));
        assertEquals(1, CompareMethod.descendingCompare(1, 2));
        assertEquals(-1, CompareMethod.descendingCompare(2, 1));
    }
}