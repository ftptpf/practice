package job4j.lambda;

import org.junit.Test;
import ru.practice.job4j.lambda.MRPredicate;

import java.util.function.Predicate;

import static org.junit.Assert.*;

public class MRPredicateTest {

    @Test
    public void test() {
        Predicate<String> predicate = MRPredicate.predicate();
        assertTrue(predicate.test(""));
        assertFalse(predicate.test("a"));
    }
}