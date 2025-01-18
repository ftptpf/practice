package ru.practice.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectToList {
    /**
     * Метод собирает переданный стрим в список.
     * @param data
     * @return
     */
    public static List<Integer> collect(Stream<Integer> data) {
        return data.collect(Collectors.toList());
    }
}