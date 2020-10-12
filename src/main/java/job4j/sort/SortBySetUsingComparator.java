package job4j.sort;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortBySetUsingComparator {
    /**
     * Метод получает сет из списка с порядком по убыванию. Среди элементов нет null.
     * @param list
     * @return
     */
    public static Set<String> sort(List<String> list) {
        Set<String> srt = new TreeSet<>(Comparator.reverseOrder());
        srt.addAll(list);
        return srt;
    }
}
