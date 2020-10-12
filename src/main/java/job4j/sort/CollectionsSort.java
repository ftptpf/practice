package job4j.sort;

import java.util.Collections;
import java.util.List;

public class CollectionsSort {
    /**
     * Метод сортирует переданный список в восходящем порядке.
     * @param data
     * @return
     */
    public static List<String> sort(List<String> data) {
        Collections.sort(data);
        return data;
    }
}
