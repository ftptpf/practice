package ru.practice.job4j.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraysStreamForPrimitive {
    /**
     * Метод создает стрим из переданного массива примитивов.
     * @param data
     * @return
     */
    public static IntStream createStream(int[] data) {
        return Arrays.stream(data);
    }
}
