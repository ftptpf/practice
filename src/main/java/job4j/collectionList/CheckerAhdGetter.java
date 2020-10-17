package job4j.collectionList;

import java.util.List;

/**
 * Метод возвращает первую строку из коллекции строк, но прежде чем получить результат -
 * проверяем содержатся ли элементы в списке.
 * Если нет - возвращаем пустую строку, иначе - первый элемент в коллекции.
 */
public class CheckerAhdGetter {
    public static String getElement(List<String> list) {
        String result = "";
        if (!list.isEmpty()) { // проверяем содержит ли элементы коллекция
            result = list.get(0); // если содержит, присваиваем пеерменной result значение первой строки
        }
        return result;
    }
}
