package job4j.sort;

import org.junit.Test;
import org.junit.Assert;
import ru.practice.job4j.sort.ArraysSortWithObject;

public class ArraysSortWithObjectTest {

    @Test
    public void test() {
        String[] input = {"a", "b", "c"};
        String[] result = ArraysSortWithObject.sort(input);
        String[] expect = {"c", "b", "a"};
        Assert.assertArrayEquals(expect, result);
    }
}