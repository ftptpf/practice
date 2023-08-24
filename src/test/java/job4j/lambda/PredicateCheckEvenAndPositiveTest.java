package job4j.lambda;

import org.junit.Test;
import ru.practice.job4j.lambda.PredicateCheckEvenAndPositive;

import static org.junit.Assert.*;

public class PredicateCheckEvenAndPositiveTest {

    @Test
    public void test() {
        assertTrue(PredicateCheckEvenAndPositive.check(2));
        assertFalse(PredicateCheckEvenAndPositive.check(-2));
        assertFalse(PredicateCheckEvenAndPositive.check(1));
    }
}