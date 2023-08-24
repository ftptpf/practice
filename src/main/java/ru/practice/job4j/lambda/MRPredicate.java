package ru.practice.job4j.lambda;

import java.util.function.Predicate;

public class MRPredicate {
    /**
     * Создаем предикат Predicate, который проверяет, что строка пустая,
     * для этого используем метод isEmpty() в классе String.
     * @return
     */
    public static Predicate<String> predicate() {
        return String::isEmpty;
    }
}
