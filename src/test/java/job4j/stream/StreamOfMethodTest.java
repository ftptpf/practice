package job4j.stream;

import org.junit.Test;
import ru.practice.job4j.stream.StreamOfMethod;

import java.util.stream.Collectors;
import static org.junit.Assert.*;

public class StreamOfMethodTest {

    @Test
    public void whenUserStreamMethod() {
        assertEquals("abc",
                StreamOfMethod.createStream().map(Object::toString).collect(Collectors.joining()));
    }
}