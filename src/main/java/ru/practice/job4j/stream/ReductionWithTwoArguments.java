package ru.practice.job4j.stream;

import java.util.List;

public class ReductionWithTwoArguments {
    /**
     * Метод умножает число 5 на элементы списка.
     * @param list
     * @return
     */
    public static Integer collect(List<Integer> list) {
        return list.stream().reduce(5, (n1, n2) -> n1 * n2);
    }
}
