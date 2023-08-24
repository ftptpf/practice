package ru.practice.job4j.sort;

import java.util.Comparator;

public class NullFirstMethod {
    /**
     * Метод перемещает все null строки в начало.
     * @return
     */
    public static Comparator<String> nullFirst() {
        return Comparator.nullsFirst(Comparator.naturalOrder());
    }
}
