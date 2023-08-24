package ru.practice.job4j.sort;

import java.util.Comparator;
import java.util.List;

public class ListSort {
    /**
     * Метод позволяет отсортировать список строк в обратной последовательности.
     * В списке могут быть null элементы, они должны оказаться в конце сортировки.
     * @param data
     * @return
     */
    public static List<String> sort(List<String> data) {
        Comparator<String> comparator = Comparator.reverseOrder();
        data.sort(Comparator.nullsLast(comparator));
        return data;
    }
}
