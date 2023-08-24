package job4j.stream;

import org.junit.Test;
import ru.practice.job4j.stream.MinMethod;

import java.util.List;
import static org.junit.Assert.*;

public class MinMethodTest {

    @Test
    public void test() {
        assertEquals(
                "a",
                MinMethod.min(List.of("ccc", "bb", "a"))
        );
    }
}