package ru.practice.job4j.sort;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SortMap {
    /**
     * Метод получает отсортированную мапу из исходной. Сортировка в обратном порядке.
     * @param map
     * @return
     */
    public static Map<Integer, String> sort(Map<Integer, String> map) {
        Map<Integer, String> m = new TreeMap<>(Comparator.reverseOrder());
        m.putAll(map);
        return m;
    }
}
