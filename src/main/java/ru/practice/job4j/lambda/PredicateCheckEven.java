package ru.practice.job4j.lambda;

import java.util.function.Predicate;

public class PredicateCheckEven {
    /**
     * Метод через лямбда выражение проверяет что число четное.
     * @param num
     * @return
     */
    public static boolean check(int num) {
        return check(x -> x % 2 == 0, num);
    }

    private static boolean check(Predicate<Integer> predicate, int num) {
        return predicate.test(num);
    }
}
