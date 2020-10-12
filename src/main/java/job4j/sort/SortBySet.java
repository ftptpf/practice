package job4j.sort;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortBySet {
    /**
     * Метод получает отсортированный сет по списку строк. Среди элементов нет null.
     * @param list
     * @return
     */
    public static Set<String> sort (List<String> list) {
        Set<String> sort = new TreeSet<>(list);
        return sort;
    }
}
