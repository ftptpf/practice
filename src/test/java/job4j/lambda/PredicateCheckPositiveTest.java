package job4j.lambda;

import org.junit.Test;
import ru.practice.job4j.lambda.PredicateCheckPositive;

import static org.junit.Assert.*;

public class PredicateCheckPositiveTest {

    @Test
    public void whenPositive() {
        assertTrue(PredicateCheckPositive.check(1));
        assertFalse(PredicateCheckPositive.check(-1));
        assertFalse(PredicateCheckPositive.check(0));
    }
}