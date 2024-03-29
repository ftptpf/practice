package job4j.sort;

import org.junit.Assert;
import org.junit.Test;
import ru.practice.job4j.sort.CollectionsSort;

import java.util.Arrays;
import java.util.List;

public class CollectionsSortTest {

    @Test
    public void test() {
        List<String> input = Arrays.asList("c", "b", "a");
        List<String> expect = Arrays.asList("a", "b", "c");
        List<String> out = CollectionsSort.sort(input);
        Assert.assertEquals(expect, out);
    }
}