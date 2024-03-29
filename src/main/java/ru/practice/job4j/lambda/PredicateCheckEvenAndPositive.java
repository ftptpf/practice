package ru.practice.job4j.lambda;

import java.util.function.Predicate;

public class PredicateCheckEvenAndPositive {
    /**
     * Метод с помощью лямбда выражения проверяет что число четное и положительное.
     * @param num
     * @return
     */
    public static boolean check(int num) {
        return check(x -> (x > 0) && (x % 2 == 0), num);
    }

    private static boolean check(Predicate<Integer> predicate, int num) {
        return predicate.test(num);
    }
}
