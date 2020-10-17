package job4j.collection;

import java.util.List;

public class RepositionElement {
    /**
     * Метод принимает в качестве параметров список и индекс элемента который необходимо заменить.
     * Сначала удаляется последний элемент в списке, а потом этим элементом заменяется элемент по индексу,
     * который пришел в параметрах метода. Учтено, что извне могут передать индекс,
     * который превышает значение размера списка.
     * @param list
     * @param index
     * @return
     */
    public static List<String> changePosition(List<String> list, int index) {
        String a = list.remove(list.size() - 1);
        if (index < list.size()) {
            list.set(index, a);
        }
        return list;
    }
}
