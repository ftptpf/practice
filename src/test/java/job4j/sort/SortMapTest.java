package job4j.sort;

import org.junit.Assert;
import org.junit.Test;
import ru.practice.job4j.sort.SortMap;

import java.util.Map;
import java.util.TreeMap;

public class SortMapTest {

    @Test
    public void test() {
        Map<Integer, String> input = Map.of(
                1, "1",
                2, "2",
                3, "3"
        );
        Map<Integer, String> expect = new TreeMap<>(input);
        Map<Integer, String> result = SortMap.sort(input);
        Assert.assertEquals(expect, result);
    }
}