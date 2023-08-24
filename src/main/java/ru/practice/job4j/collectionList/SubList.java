package ru.practice.job4j.collectionList;

import java.util.List;

public class SubList {
    /**
     * Vетод принимает два параметра - список и элемент, который предполагается, что содержится в этом списке.
     * 1. Элемента нет в списке - возвращает пустой список.
     * 2. Элемент в списке встречается 1 раз - возвращает пустой список.
     * 3. Элемент встречается более одного - возвращается список, начиная с первого вхождения элемента
     * и заканчивая предшествующим последнему вхождению элемента в исходной коллекции.
     * @param list
     * @param el
     * @return
     */
    public static List<String> getElementsBetweenIndexes(List<String> list, String el) {
        if (!list.contains(el) || list.indexOf(el) == list.lastIndexOf(el)) {
            list.clear();
        } else if (list.indexOf(el) != list.lastIndexOf(el)) {
            list = list.subList(list.indexOf(el), list.lastIndexOf(el));
        }
        return list;
    }
}
