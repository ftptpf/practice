package ru.practice.job4j.stream;

import java.util.stream.Stream;

public class StreamBuilder {
    /**
     * Метод создает стрим из первого и последнего элементов массива.
     * @param data
     * @return
     */
    public static Stream<Object> createStream(Integer[] data) {
        return Stream.builder().add(data[0]).add(data[data.length - 1]).build();
    }
}
