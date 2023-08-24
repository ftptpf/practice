package ru.practice.job4j.stream;

import java.util.Collection;
import java.util.stream.Stream;

public class StreamMethod {
    /**
     * Метод создает стрим из переданной коллекции.
     * @param data
     * @return
     */
    public static Stream<Integer> createStream(Collection<Integer> data) {
        return data.stream();
    }
}
