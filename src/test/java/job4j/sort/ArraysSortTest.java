package job4j.sort;

import org.junit.Test;
import org.junit.Assert;


public class ArraysSortTest {

    @Test
    public void test() {
        long[] data = {3, 2, 1};
        long[] result = ArraysSort.sort(data);
        long[] expect = {1, 2, 3};
        Assert.assertArrayEquals(expect, result);
    }
}