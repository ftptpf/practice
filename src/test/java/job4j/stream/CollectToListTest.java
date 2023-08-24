package job4j.stream;

import org.junit.Test;
import ru.practice.job4j.stream.CollectToList;

import java.util.List;
import static org.junit.Assert.*;

public class CollectToListTest {

    @Test
    public void test() {
        List<Integer> input = List.of(1, 2);
        List<Integer> expect = List.of(1, 2);
        assertEquals(expect, CollectToList.collect(input.stream()));
    }
}