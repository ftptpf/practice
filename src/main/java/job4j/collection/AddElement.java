package job4j.collection;

import java.util.ArrayList;
import java.util.List;

public class AddElement {
    /**
     * Метод добавляет элемент в список и сообщает нам удалось это или нет.
     * Не используем в методе то, что метод возвращает true или false.
     * Для этого на входе в метод мы копируем список в новый список, добавляем в тот список,
     * который пришел в методе и в конце сравниваем их размеры - если изменился, значит элемент добавился.
     * @param list
     * @param str
     * @return
     */
    public static boolean addNewElement(List<String> list, String str) {
        List<String> check = new ArrayList<>(list);
        boolean result = false;
        check.add(str);
        if (check.size() != list.size()) {
            result = true;
        }
        return result;
    }
}
