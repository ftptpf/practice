package job4j.collection;

import java.util.ArrayList;
import java.util.List;

public class AddIndexElement {
    /**
     * Метод добавляет элемент в список по индексу, при этом он добавлять элемент только в том случае,
     * если этого элемента еще нет в коллекции. При этом метод возвращает булево значение.
     * Для этого сравнивается размер дубликата списка и списка в который мы добавляем элемент.
     * @param list
     * @param index
     * @param str
     * @return
     */
    public static boolean addNewElement(List<String> list, int index, String str) {
        List<String> check = new ArrayList<>(list);
        boolean result = false;
        if (!list.contains(str)) {
            list.add(index, str);
            if (list.size() != check.size()) {
                result = true;
            }
        }
        return result;
    }
}
