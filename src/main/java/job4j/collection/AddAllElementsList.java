package job4j.collection;

import java.util.List;

public class AddAllElementsList {
    /**
     * Метод принимает 2 списка и элемент, который возможно содержится в этих списках.
     * Проверяем оба списка, содержат ли они одновременно этот элемент, если содержит - удаляем элемент из первого списка.
     * Второй список добавляем в первый. Возращаем индекс элемента, который пришел в параметрах метода из общего списка.
     * @param left
     * @param right
     * @param str
     * @return
     */
    public static int containsElement(List<String> left, List<String> right, String str) {
        if (left.contains(str) && right.contains(str)) {
            left.remove(str);
        }
        left.addAll(right);
        int a = left.indexOf(str);
        return a;
    }
}
