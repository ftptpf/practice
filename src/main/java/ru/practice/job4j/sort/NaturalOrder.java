package ru.practice.job4j.sort;

import java.util.Comparator;

public class NaturalOrder {
    /**
     * Метод выполняет прямую сортировку для строки.
     * @return
     */
    public static Comparator<String> naturalOrder() {
        return Comparator.naturalOrder();
    }
}
