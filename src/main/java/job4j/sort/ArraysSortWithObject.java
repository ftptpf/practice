package job4j.sort;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortWithObject {
    /**
     * Метод сортирует массив строк в убывающем порядке и возращает его.
     * @param data
     * @return
     */
    public static String[] sort(String[] data) {
        Arrays.sort(data, Comparator.reverseOrder());
        return data;
    }
}
