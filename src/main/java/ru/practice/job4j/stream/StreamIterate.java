package ru.practice.job4j.stream;

import java.util.stream.Stream;

public class StreamIterate {
    /**
     * Метод выполняет обход каждого второого элемента массива начиная с 0.
     * @param data
     */
    public static void showArray(Integer[] data) {
        Stream.iterate(0, i -> i < data.length, i -> i + 2)
                .forEach(i -> System.out.println(data[i]));
    }
}
