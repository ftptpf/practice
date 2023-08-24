package job4j.stream;

import org.junit.Test;
import ru.practice.job4j.stream.CollectorClass;

import java.util.List;
import static org.junit.Assert.*;

public class CollectorClassTest {

    @Test
    public void test() {
        assertEquals(
                List.of(1, 2, 3),
                CollectorClass.collect(List.of(1, 2, 3))
        );
    }
}