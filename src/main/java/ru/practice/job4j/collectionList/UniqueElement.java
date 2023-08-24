package ru.practice.job4j.collectionList;

import java.util.List;

public class UniqueElement {
    /**
     * Метод принимает список и элемент который мы ищем в списке.
     * Определяем, является ли этот элемент уникальным в этом списке.
     * Для это необходимо находим первый и последний индекс вхождения элемента.
     * Если равны - значит элемент уникальный. Предусматриваем ситуацию,
     * что такого элемента нет вообще в коллекции, в этом случае возвращаем false.
     * @param list
     * @param str
     * @return
     */
    public static boolean checkList(List<String> list, String str) {
        boolean result = false;
        if (list.contains(str) && (list.indexOf(str) == list.lastIndexOf(str))) {
            result = true;
        }
        return result;
    }
}
