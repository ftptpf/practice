package job4j.lambda;

import org.junit.Test;
import ru.practice.job4j.lambda.PredicateCheckEven;

import static org.junit.Assert.*;

public class PredicateCheckEvenTest {

    @Test
    public void test() {
        assertTrue(PredicateCheckEven.check(2));
        assertFalse(PredicateCheckEven.check(1));
    }
}