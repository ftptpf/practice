package ru.practice.job4j.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArraysStreamMethod {
    /**
     * Метод создает стрим из переданного массива.
     * @param data
     * @return
     */
    public static Stream<Integer> createStream(Integer[] data) {
        return Arrays.stream(data);
    }
}
