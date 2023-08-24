package ru.practice.job4j.stream;

import java.util.Comparator;
import java.util.List;

public class MinMethod {
    /**
     * Метод находит строку минимальной длины.
     * @param list
     * @return
     */
    public static String min(List<String> list) {
        return list.stream().min((Comparator.comparing(String::length))).get();
    }
}
